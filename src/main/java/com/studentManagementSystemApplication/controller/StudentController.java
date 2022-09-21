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
import com.studentManagementSystemApplication.entity.Student;
import com.studentManagementSystemApplication.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	public StudentService sServ;

	@GetMapping("/Studentlist")
	public List<Student>getStudent(@RequestBody Student student)
	{
		return this.sServ.listAll();
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		return this.sServ.addStudent(student);
	}
	
	@PutMapping("/updateStudent/{studId}")
	public Student updateStudent(@PathVariable int studId,@RequestBody Student s) 
	{
	     return this.sServ.updateStudent(studId,s);
	     
	}

	@DeleteMapping("/deleteStudent/{studId}")
	public String deleteStudentByID(@PathVariable int studId)
	{
		sServ.deleteById(studId);
		return "Deleted Successfully";
	}
}
