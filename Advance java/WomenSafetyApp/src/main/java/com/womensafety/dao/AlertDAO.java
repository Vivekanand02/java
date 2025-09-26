package com.womensafety.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import com.womensafety.model.Alert;
import com.womensafety.util.DBConnection;

public class AlertDAO {

	public boolean saveAlert(Alert alert) {
		boolean result = false;

		try (Connection conn = DBConnection.getConnection()) {
			String sql = "INSERT INTO alerts (user_id, location, timestamp) VALUES (?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, alert.getUserId());
			stmt.setString(2, alert.getLocation());
			stmt.setTimestamp(3, Timestamp.valueOf(alert.getTimestamp()));

			result = stmt.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
