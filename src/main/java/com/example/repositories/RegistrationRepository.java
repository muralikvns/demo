package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.domains.Registration;
	@Repository
	public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
		
		@Query("select r from Registration r where r.email = :email")
		Registration findByemail(@Param("email") String email);
}
