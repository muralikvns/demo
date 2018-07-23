package com.example.domains;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.example.domains.unique;


@Entity
public class Login {

	
	@Id
	@GeneratedValue
	private Long id;
	
	
	@Pattern(regexp=".+@.+\\..+", message="Invalid email!")
	private String email;
	
	@NotNull(message="password should not be empty!")
	@Length(min=5, max=10, message="Password should be between 5 - 10 charactes")
	private String password;
	private String remember;
	
	public String getRemember() {
		return remember;
	}
	public void setRemember(String remember) {
		this.remember = remember;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
