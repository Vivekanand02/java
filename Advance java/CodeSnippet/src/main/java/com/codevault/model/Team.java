package com.codevault.model;

public class Team {
	private int id;
	private String name;
	private String description;
	private int ownerId;
	private String createdAt;

	public Team() {
	}

	public Team(int id, String name, String description, int ownerId, String createdAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.ownerId = ownerId;
		this.createdAt = createdAt;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}
