package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.User;
import util.DBConnection;

public class UserDAO {
	public static User login(String email, String password) {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT * FROM users WHERE email=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return new User(rs.getString("name"), email, rs.getString("mobile"), password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getStatus(String email) {
		try (Connection conn = DBConnection.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT status FROM users WHERE email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				return rs.getString("status");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT u.id, u.name, u.email, u.role, a.balance "
						+ "FROM users u JOIN accounts a ON u.id = a.user_id")) {

			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setRole(rs.getString("role"));
				u.setBalance(rs.getDouble("balance"));
				list.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
