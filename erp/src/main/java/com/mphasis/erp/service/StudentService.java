package com.mphasis.erp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.erp.controller.Student;
import com.mphasis.erp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	public  Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	public  List<Student> getAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}
}
