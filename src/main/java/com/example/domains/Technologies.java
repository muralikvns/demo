package com.example.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Technologies {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String technologies;

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
