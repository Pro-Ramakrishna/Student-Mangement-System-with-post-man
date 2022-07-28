package com.ram.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
