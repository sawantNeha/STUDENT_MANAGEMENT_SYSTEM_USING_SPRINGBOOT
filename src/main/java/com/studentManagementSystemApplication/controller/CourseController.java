package com.studentManagementSystemApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagementSystemApplication.entity.Course;
import com.studentManagementSystemApplication.entity.Student;
import com.studentManagementSystemApplication.service.CourseService;
import com.studentManagementSystemApplication.service.StudentService;


@RestController
public class CourseController {
	@Autowired
	 public CourseService cserv;

	@Autowired
	public StudentService studserv;
	 
	@GetMapping("/Courselist")
	public List<Course>getCourse(){
		return this.cserv.listAll();
	}
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course, @RequestParam("cid") int stud_Id) {
		Student student = this.studserv.findStudentById(stud_Id);
		course.setStudent(student);
		return this.cserv.addCourse(course);
		
	}
	@PutMapping("/updateCourse/{course_Id}")
	public Course updateCourse(@PathVariable int course_Id,@RequestBody Course course) 
	{
	     return this.cserv.updateCourse(course_Id,course);
	     
	}

	@DeleteMapping("/deletecourse/{course_Id}")
	public String deleteCourseByID(@PathVariable int course_Id)
	{
		cserv.deleteById(course_Id);
		return "Deleted Successfully";
	}
}


