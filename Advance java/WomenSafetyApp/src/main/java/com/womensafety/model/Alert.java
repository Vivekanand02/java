package com.womensafety.model;

import java.time.LocalDateTime;

public class Alert {
	private int id;
	private int userId;
	private String location;
	private LocalDateTime timestamp;

	public Alert() {
	}

	public Alert(int userId, String location, LocalDateTime timestamp) {
		this.userId = userId;
		this.location = location;
		this.timestamp = timestamp;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
