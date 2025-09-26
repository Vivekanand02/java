package com.codevault.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.codevault.model.Team;
import com.codevault.model.TeamInvite;
import com.codevault.model.User;
import com.codevault.util.DB;

public class TeamDAO {
	private int id;
	private String name;
	private int ownerId; // Optional, based on your DB schema

	// ✅ Add this constructor to fix the error
	public TeamDAO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Optional: Full-arg constructor
	public TeamDAO(int id, String name, int ownerId) {
		this.id = id;
		this.name = name;
		this.ownerId = ownerId;
	}

	// Optional: No-arg constructor
	public TeamDAO() {
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public static List<Team> getTeamsByUser(int userId) {
		List<Team> teams = new ArrayList<>();
		String sql = "SELECT t.id, t.name FROM teams t " + "JOIN team_members tm ON t.id = tm.team_id "
				+ "WHERE tm.user_id = ?";

		try (Connection conn = DB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				teams.add(new Team(rs.getInt("id"), rs.getString("name"), sql, rs.getInt("ownerId"), sql));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return teams;
	}

	public static void createTeam(String name, int ownerId) {
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn.prepareStatement("INSERT INTO teams (name, owner_id) VALUES (?, ?)")) {

			ps.setString(1, name);
			ps.setInt(2, ownerId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addUserToTeam(int teamId, int userId) {
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO team_members (team_id, user_id) VALUES (?, ?)")) {

			ps.setInt(1, teamId);
			ps.setInt(2, userId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Integer> getUserTeamIds(int userId) {
		List<Integer> teamIds = new ArrayList<>();
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn.prepareStatement("SELECT team_id FROM team_members WHERE user_id = ?")) {

			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				teamIds.add(rs.getInt("team_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return teamIds;
	}

	public static List<User> getMembers(int teamId) {
		List<User> list = new ArrayList<>();
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn.prepareStatement(
						"SELECT u.id, u.name, u.email FROM users u JOIN team_members tm ON u.id = tm.user_id WHERE tm.team_id = ?")) {

			ps.setInt(1, teamId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("passwordHash"), rs.getString("role"), rs.getString("createdAt")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void removeUserFromTeam(int teamId, int userId) {
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn
						.prepareStatement("DELETE FROM team_members WHERE team_id = ? AND user_id = ?")) {
			ps.setInt(1, teamId);
			ps.setInt(2, userId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendInvite(int teamId, int invitedUserId) {
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO team_invites (team_id, invited_user_id) VALUES (?, ?)")) {

			ps.setInt(1, teamId);
			ps.setInt(2, invitedUserId);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<TeamInvite> getPendingInvites(int userId) {
		List<TeamInvite> invites = new ArrayList<>();
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn.prepareStatement(
						"SELECT * FROM team_invites WHERE invited_user_id = ? AND status = 'PENDING'")) {
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				invites.add(new TeamInvite(rs.getInt("id"), rs.getInt("team_id"), rs.getInt("invited_user_id"),
						rs.getString("status"), rs.getTimestamp("created_at")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return invites;
	}

	public static void handleInvite(int inviteId, int teamId, int userId, boolean accepted) {
		try (Connection conn = DB.getConnection()) {
			conn.setAutoCommit(false);

			String status = accepted ? "ACCEPTED" : "REJECTED";

			try (PreparedStatement ps1 = conn.prepareStatement("UPDATE team_invites SET status = ? WHERE id = ?")) {
				ps1.setString(1, status);
				ps1.setInt(2, inviteId);
				ps1.executeUpdate();
			}

			if (accepted) {
				try (PreparedStatement ps2 = conn
						.prepareStatement("INSERT INTO team_members (team_id, user_id) VALUES (?, ?)")) {
					ps2.setInt(1, teamId);
					ps2.setInt(2, userId);
					ps2.executeUpdate();
				}
			}

			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
