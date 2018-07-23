package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domains.Course;
import com.example.domains.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,Long> {
	

	}


