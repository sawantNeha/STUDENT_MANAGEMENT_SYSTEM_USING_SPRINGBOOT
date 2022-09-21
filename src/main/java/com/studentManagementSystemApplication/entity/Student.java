package com.studentManagementSystemApplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int studId;
	 
	 @NotNull
	 @Column(name="firstname")
	 private String firstName;
	 
	 @NotNull
	 @Column(name="lastname")
	 private String lastName;
	 
	 @NotNull
	 @Column(name="Email")
	 private String email;
	 
	 @NotNull
	 @Column(name="password")
	 private String password;
	 
	 
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "student", cascade = CascadeType.ALL)
	 private List<Course> course;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int StudId) {
		this.studId = StudId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	 
	 
}
