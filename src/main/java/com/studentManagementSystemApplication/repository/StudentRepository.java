package com.studentManagementSystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagementSystemApplication.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	Student findByStudId(int studId);
	
	

}
