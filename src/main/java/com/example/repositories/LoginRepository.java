package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.domains.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {
	
	 @Query("select l from Login l where l.email = :email")
	  Login findByemail(@Param("email") String email);
	 
	
}