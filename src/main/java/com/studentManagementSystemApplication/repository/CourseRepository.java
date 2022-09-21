package com.studentManagementSystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagementSystemApplication.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	
    
}
