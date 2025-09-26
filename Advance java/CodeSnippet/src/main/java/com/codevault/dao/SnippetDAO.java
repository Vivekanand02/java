package com.codevault.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.codevault.model.Snippet;
import com.codevault.util.DB;

public class SnippetDAO {

	public static List<Snippet> getAllSnippets() {
		List<Snippet> list = new ArrayList<>();
		try (Connection conn = DB.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM snippets")) {

			while (rs.next()) {
				list.add(new Snippet(rs.getInt("id"), rs.getInt("user_id"), rs.getString("title"), rs.getString("code"),
						rs.getString("language"), rs.getString("created_at"), rs.getInt("team_id")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void insertSnippet(Snippet s) {
		String sql = "INSERT INTO snippets (user_id, title, code, language, team_id) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = DB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, s.getUserId());
			ps.setString(2, s.getTitle());
			ps.setString(3, s.getCode());
			ps.setString(4, s.getLanguage());
			ps.setObject(5, s.getTeamId() != null ? s.getTeamId() : null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Snippet> getSnippetsByUser(int userId) {
		List<Snippet> list = new ArrayList<>();
		String sql = "SELECT * FROM snippets WHERE user_id = ? ORDER BY created_at DESC";

		try (Connection conn = DB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Snippet(rs.getInt("id"), rs.getInt("user_id"), rs.getString("title"), rs.getString("code"),
						rs.getString("language"), rs.getString("created_at"), rs.getInt("team_id")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void deleteSnippetById(int id) {
		try (Connection conn = DB.getConnection();
				PreparedStatement ps = conn.prepareStatement("DELETE FROM snippets WHERE id = ?")) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createSnippet(int userId, String title, String code, String language, Integer teamId) {
		String sql = "INSERT INTO snippets (user_id, title, code, language, team_id) VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, userId);
			ps.setString(2, title);
			ps.setString(3, code);
			ps.setString(4, language);
			if (teamId != null) {
				ps.setInt(5, teamId);
			} else {
				ps.setNull(5, Types.INTEGER);
			}
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Snippet> getSnippetsByTeamId(List<Integer> teamIds) {
		List<Snippet> list = new ArrayList<>();
		if (teamIds == null || teamIds.isEmpty())
			return list;

		StringBuilder query = new StringBuilder("SELECT * FROM snippets WHERE team_id IN (");
		for (int i = 0; i < teamIds.size(); i++) {
			query.append("?");
			if (i < teamIds.size() - 1)
				query.append(",");
		}
		query.append(")");

		try (Connection conn = DB.getConnection(); PreparedStatement ps = conn.prepareStatement(query.toString())) {

			for (int i = 0; i < teamIds.size(); i++) {
				ps.setInt(i + 1, teamIds.get(i));
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Snippet(rs.getInt("id"), rs.getInt("user_id"), rs.getString("title"), rs.getString("code"),
						rs.getString("language"), rs.getString("created_at"), rs.getInt("team_id")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
