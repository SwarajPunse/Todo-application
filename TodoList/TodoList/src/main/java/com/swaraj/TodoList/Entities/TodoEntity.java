package com.swaraj.TodoList.Entities;



import java.time.LocalDate;
import java.time.LocalDateTime;


import org.springframework.data.annotation.CreatedDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "todolist")
public class TodoEntity  { // Interface for basic CRUD operations

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String userid;

    @Column
    private String task;

    @Column
    private boolean isCompleted= false;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt=LocalDateTime.now();

    @Column(name = "scheduled_at")
    private LocalDate scheduledAt;
    

    public TodoEntity() {
		super();
	}

    
    
	public TodoEntity(Long id, String userid, String task, LocalDate scheduledAt) {
		super();
		this.userid = userid;
		this.task = task;
		this.scheduledAt = scheduledAt;
	}

	


	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public LocalDate getScheduledAt() {
		return scheduledAt;
	}



	public void setScheduledAt(LocalDate scheduledAt) {
		this.scheduledAt = scheduledAt;
	}





	

    
    

}