package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domains.Technologies;

	@Repository
	public interface TechnologiesRepository extends JpaRepository<Technologies,Long> {
	
}
