package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@NotNull
	@Column(unique=true, nullable=false, updatable=false)
	private String user_username;

	@NotNull
	@Column(nullable=false)
	private String user_password;
	
	@NotNull
	@Column(nullable=false)
	private String first_name;
	
	@NotNull
	@Column(nullable=false)
	private String last_name;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, @NotNull String user_username, @NotNull String user_password, @NotNull String first_name,
			@NotNull String last_name) {
		super();
		this.user_id = user_id;
		this.user_username = user_username;
		this.user_password = user_password;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((user_username == null) ? 0 : user_username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_username == null) {
			if (other.user_username != null)
				return false;
		} else if (!user_username.equals(other.user_username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_username=" + user_username + ", user_password=" + user_password
				+ ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
	
	
}
