package com.codevault.model;

import java.sql.Timestamp;

public class TeamInvite {
	private int id;
	private int teamId;
	private int invitedUserId;
	private String status; // PENDING, ACCEPTED, REJECTED
	private Timestamp createdAt;

	public TeamInvite() {
	}

	public TeamInvite(int id, int teamId, int invitedUserId, String status, Timestamp createdAt) {
		this.id = id;
		this.teamId = teamId;
		this.invitedUserId = invitedUserId;
		this.status = status;
		this.createdAt = createdAt;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getInvitedUserId() {
		return invitedUserId;
	}

	public void setInvitedUserId(int invitedUserId) {
		this.invitedUserId = invitedUserId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
