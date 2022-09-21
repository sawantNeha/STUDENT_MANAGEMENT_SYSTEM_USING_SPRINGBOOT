package com.studentManagementSystemApplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Course")
public class Course {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private int course_Id;
	
	@NotNull
	@Column(name="Course_Name")
    private String courseName;	
	
	@NotNull
	@Column(name="learner")
	private String learner;
	
	@Column(name="Fee")
	private String fee;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "studId")
	private Student student;

	public int getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}
    
	public String getCourseName() {
		return courseName;
	}

	public String getLearner() {
		return learner;
	}

	public String getFee() {
		return fee;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}
