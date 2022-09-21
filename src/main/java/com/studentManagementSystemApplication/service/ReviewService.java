package com.studentManagementSystemApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagementSystemApplication.entity.Review;

import com.studentManagementSystemApplication.repository.ReviewRepository;

@Service
public class ReviewService {
	
    @Autowired
    public ReviewRepository reviewRepository;
    
    public List<Review> listAll(){
		return reviewRepository.findAll();
	}
	public Review addReview(Review review) {
		return reviewRepository.save(review);
	}
	public Review findById(int id) {
		return reviewRepository.findById(id);
	}
	public Review updateReview(int id,Review r)
	{
		r.setId(id);
		return reviewRepository.save(r);
	}

	public void deleteById(int id)
	{
		reviewRepository.deleteById(id);
	}
    
}
