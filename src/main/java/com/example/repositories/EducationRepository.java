package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domains.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {
	
	
}
