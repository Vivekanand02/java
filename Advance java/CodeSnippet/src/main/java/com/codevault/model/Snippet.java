package com.codevault.model;

public class Snippet {
	private int id;
	private int userId;
	private String title;
	private String code;
	private String language;
	private String createdAt;
	private Integer teamId;

	// Constructor
	public Snippet(int id, int userId, String title, String code, String language, String createdAt, Integer teamId) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.code = code;
		this.language = language;
		this.createdAt = createdAt;
		this.teamId = teamId;
	}

	// ✅ Getters
	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getCode() {
		return code;
	}

	public String getLanguage() {
		return language;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public Integer getTeamId() {
		return teamId;
	}

	// (Setters can also be added if needed)
}
