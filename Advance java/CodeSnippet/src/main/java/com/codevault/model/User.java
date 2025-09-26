package com.codevault.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String passwordHash;
	private String role;
	private String createdAt;

	public User(int id, String name, String email, String passwordHash, String role, String createdAt) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.passwordHash = passwordHash;
		this.role = role;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public String getRole() {
		return role;
	}

	public String getCreatedAt() {
		return createdAt;
	}
}
