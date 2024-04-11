package com.swaraj.Todouser.entities;

import java.time.LocalDateTime;


public class Todo {

	private Long id;

	private String userid;

	private String task;

	private boolean isCompleted = false;

	private LocalDateTime createdAt = LocalDateTime.now();

	private LocalDateTime scheduledAt;

	public Todo(Long id, String userid, String task, boolean isCompleted, LocalDateTime createdAt,
			LocalDateTime scheduledAt) {
		super();
		this.id = id;
		this.userid = userid;
		this.task = task;
		this.isCompleted = isCompleted;
		this.createdAt = createdAt;
		this.scheduledAt = scheduledAt;
	}

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getScheduledAt() {
		return scheduledAt;
	}

	public void setScheduledAt(LocalDateTime scheduledAt) {
		this.scheduledAt = scheduledAt;
	}

}
