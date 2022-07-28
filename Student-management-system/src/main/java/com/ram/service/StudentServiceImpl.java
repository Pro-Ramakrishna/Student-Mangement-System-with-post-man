package com.ram.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.model.Student;
import com.ram.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo stdRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student student1=stdRepo.save(student);
		return student1;
	}

	
	@Override
	public Student updateStudent(Student Id) {
		// TODO Auto-generated method stub
		Student student1=stdRepo.save(Id);
		return student1;
	}

	@Override
	public void deleteStudent(Integer Id) {
		// TODO Auto-generated method stub
		stdRepo.deleteById(Id);
	}

	@Override
	public Student getStudent(Integer Id) {
		// TODO Auto-generated method stub
		Optional<Student> student=stdRepo.findById(Id);
		Student studentReposne=student.get();
		return studentReposne;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList=stdRepo.findAll();
		return studentList;
	}
}
