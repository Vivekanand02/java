package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Transaction;
import util.DBConnection;

public class AccountDAO {
	public static boolean transferAmount(String fromEmail, String toEmail, double amount) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false); // Start transaction

			// Get sender balance
			ps = conn.prepareStatement("SELECT balance FROM accounts a JOIN users u ON a.user_id=u.id WHERE u.email=?");
			ps.setString(1, fromEmail);
			rs = ps.executeQuery();
			if (!rs.next())
				return false;

			double senderBalance = rs.getDouble("balance");
			if (senderBalance < amount)
				return false;

			// Get sender and receiver account IDs
			int fromAccId = getAccountIdByEmail(fromEmail, conn);
			int toAccId = getAccountIdByEmail(toEmail, conn);

			if (fromAccId == -1 || toAccId == -1)
				return false;

			// Deduct from sender
			ps = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
			ps.setDouble(1, amount);
			ps.setInt(2, fromAccId);
			ps.executeUpdate();

			// Add to receiver
			ps = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
			ps.setDouble(1, amount);
			ps.setInt(2, toAccId);
			ps.executeUpdate();

			// Insert transaction records
			ps = conn.prepareStatement(
					"INSERT INTO transactions (from_account, to_account, amount, type) VALUES (?, ?, ?, ?)");
			ps.setInt(1, fromAccId);
			ps.setInt(2, toAccId);
			ps.setDouble(3, amount);
			ps.setString(4, "debit");
			ps.executeUpdate();

			ps = conn.prepareStatement(
					"INSERT INTO transactions (from_account, to_account, amount, type) VALUES (?, ?, ?, ?)");
			ps.setInt(1, toAccId);
			ps.setInt(2, fromAccId);
			ps.setDouble(3, amount);
			ps.setString(4, "credit");
			ps.executeUpdate();

			conn.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (conn != null)
					conn.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return false;
		} finally {
			try {
				if (conn != null)
					conn.setAutoCommit(true);
			} catch (SQLException ignored) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException ignored) {
			}
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException ignored) {
			}
		}
	}

	private static int getAccountIdByEmail(String email, Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(
				"SELECT a.account_id FROM accounts a JOIN users u ON a.user_id = u.id WHERE u.email=?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if (rs.next())
			return rs.getInt("account_id");
		return -1;
	}

	public static List<Transaction> getTransactionHistory(String email) {
		List<Transaction> transactions = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT t.*, u1.email as fromEmail, u2.email as toEmail " + "FROM transactions t "
					+ "JOIN accounts a1 ON t.from_account = a1.account_id " + "JOIN users u1 ON a1.user_id = u1.id "
					+ "JOIN accounts a2 ON t.to_account = a2.account_id " + "JOIN users u2 ON a2.user_id = u2.id "
					+ "WHERE u1.email=? OR u2.email=? ORDER BY t.timestamp DESC";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, email);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Transaction tx = new Transaction();
				tx.setId(rs.getInt("transaction_id"));
				tx.setFrom(rs.getString("fromEmail"));
				tx.setTo(rs.getString("toEmail"));
				tx.setAmount(rs.getDouble("amount"));
				tx.setType(rs.getString("type"));
				tx.setTimestamp(rs.getTimestamp("timestamp").toString());

				transactions.add(tx);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return transactions;
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT t.*, u1.email as fromEmail, u2.email as toEmail " + "FROM transactions t "
					+ "JOIN accounts a1 ON t.from_account = a1.account_id " + "JOIN users u1 ON a1.user_id = u1.id "
					+ "JOIN accounts a2 ON t.to_account = a2.account_id " + "JOIN users u2 ON a2.user_id = u2.id "
					+ "ORDER BY t.timestamp DESC";

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Transaction tx = new Transaction();
				tx.setId(rs.getInt("transaction_id"));
				tx.setFrom(rs.getString("fromEmail"));
				tx.setTo(rs.getString("toEmail"));
				tx.setAmount(rs.getDouble("amount"));
				tx.setType(rs.getString("type"));
				tx.setTimestamp(rs.getTimestamp("timestamp").toString());

				transactions.add(tx);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return transactions;
	}

}
