package com.studentManagementSystemApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.studentManagementSystemApplication.entity.Review;
import com.studentManagementSystemApplication.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	public ReviewService reviewService;
	
	@GetMapping("/review")
	public List<Review>getReview(@RequestBody Review review)
	{
		return this.reviewService.listAll();
	}
	
	@PostMapping("/addReview")
	public Review addReview(@RequestBody Review review)
	{
		return this.reviewService.addReview(review);
	}
	
	@PutMapping("/updateReview/{id}")
	public Review updateReview(@PathVariable int id,@RequestBody Review r) 
	{
	     return this.reviewService.updateReview(id,r);
	     
	}
	
	@DeleteMapping("/deleteReview/{id}")
	public String deleteByID(@PathVariable int id)
	{
		reviewService.deleteById(id);
		return "Deleted Successfully";
	}

}
