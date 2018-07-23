package com.example.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Education {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String Education;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}
	

}
