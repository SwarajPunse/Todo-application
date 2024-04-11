package com.swaraj.TodoList.Dao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DummyTodo {

	private LocalDate updatedDate;
	
	private String updatedTask;

	public DummyTodo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DummyTodo(LocalDate updatedDate, String updatedTask) {
		super();
		this.updatedDate = updatedDate;
		this.updatedTask = updatedTask;
	}

	public DummyTodo(LocalDate updatedDate) {
		super();
		this.updatedDate = updatedDate;
	}

	public DummyTodo(String updatedTask) {
		super();
		this.updatedTask = updatedTask;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedTask() {
		return updatedTask;
	}

	public void setUpdatedTask(String updatedTask) {
		this.updatedTask = updatedTask;
	}
	
	
}
