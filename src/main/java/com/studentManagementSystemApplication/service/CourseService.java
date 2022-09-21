package com.studentManagementSystemApplication.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagementSystemApplication.entity.Course;
import com.studentManagementSystemApplication.entity.Student;
import com.studentManagementSystemApplication.repository.CourseRepository;


@Service
public class CourseService {
	@Autowired
	public CourseRepository crepo;

	
	public List<Course> listAll(){
		return crepo.findAll();
	}
	
	public Course addCourse(Course course) {
		return crepo.save(course);
	}
	
	public Course updateCourse(int course_Id,Course c)
	{
		c.setCourse_Id(course_Id);
		return crepo.save(c);
	}
	
	public void deleteById(int course_Id)
	{
		crepo.deleteById(course_Id);
	}
	
	
}
