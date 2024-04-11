package com.swaraj.Todouser.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@Column(name = "ID")
	private String userid;

	@Column(name = "NAME")
	private String username;

	@Column(name = "EMAIL")
	private String emailid;

	@Column(name = "ABOUT")
	private String about;
	
	@Transient
	private List<Todo> todos;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	


	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	public User(String userid, String username, String emailid, String about, List<Todo> todos) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailid = emailid;
		this.about = about;
		this.todos = todos;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", emailid=" + emailid + ", about=" + about
				+ ", todos=" + todos + "]";
	}
	
	

}
