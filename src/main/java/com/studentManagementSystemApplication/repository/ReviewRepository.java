package com.studentManagementSystemApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagementSystemApplication.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
      Review findById(int id);

}
