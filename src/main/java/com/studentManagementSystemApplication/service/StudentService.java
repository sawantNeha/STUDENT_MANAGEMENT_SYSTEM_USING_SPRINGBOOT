package com.studentManagementSystemApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentManagementSystemApplication.entity.Student;
import com.studentManagementSystemApplication.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository srepo;

	public List<Student> listAll(){
		return srepo.findAll();
	}
	public Student addStudent(Student student) {
		return srepo.save(student);
	}
	public Student findStudentById(int id) {
		return srepo.findByStudId(id);
	}
	public Student updateStudent(int studId,Student s)
	{
		s.setStudId(studId);
		return srepo.save(s);
	}

	public void deleteById(int studId)
	{
		srepo.deleteById(studId);
	}
}
