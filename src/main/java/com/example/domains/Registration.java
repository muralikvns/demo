package com.example.domains;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Registration {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotEmpty(message="Username is mandatory.")
	private String firstName;
	@NotEmpty(message="Lastname is mandatory.")
	private String  lastName;
	
	@OneToOne
	private Experience experience;
	
	public Experience getExperience() {
		return experience;
	}
	public void setExperience(Experience experience) {
		this.experience = experience;
	}
	@OneToOne
	private Technologies technologies;
	
	@OneToOne
	private Education education;

	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	
	@NotEmpty(message="email is mandatory.")
	@Pattern(regexp=".+@.+\\..+", message="Invalid email!")
	//@UniqueRegistration
	private String email;
	
	private String gender;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public Technologies getTechnologies() {
		return technologies;
	}
	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
