package com.ram.service;

import java.util.List;

import com.ram.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);     
	public Student updateStudent(Student student);     // update
	public void deleteStudent(Integer Id);   // 
	public Student getStudent(Integer Id);  // 
	public List<Student> getAllStudent();       // 
	
}