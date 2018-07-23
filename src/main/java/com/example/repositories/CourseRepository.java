package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domains.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
	
	//public  void saveRegistration(Registration reg);
	
	

}
