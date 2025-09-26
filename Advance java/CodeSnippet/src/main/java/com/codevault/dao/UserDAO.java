package com.codevault.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.codevault.model.User;
import com.codevault.util.DB;

public class UserDAO {

	public static List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		try (Connection con = DB.getConnection();
				PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				User u = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("passwordHash"), rs.getString("role"), rs.getString("createdAt"));
				list.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void deleteUser(int id) {
		try (Connection con = DB.getConnection();
				PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id=?")) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void toggleUserRole(int id) {
		try (Connection con = DB.getConnection();
				PreparedStatement ps1 = con.prepareStatement("SELECT role FROM users WHERE id=?");
				PreparedStatement ps2 = con.prepareStatement("UPDATE users SET role=? WHERE id=?")) {

			ps1.setInt(1, id);
			ResultSet rs = ps1.executeQuery();
			if (rs.next()) {
				String currentRole = rs.getString("role");
				String newRole = currentRole.equals("admin") ? "user" : "admin";

				ps2.setString(1, newRole);
				ps2.setInt(2, id);
				ps2.executeUpdate();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
