package com.mphasis.erp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.erp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping(value="/save/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student>  saveStudetn(@RequestBody Student student) {
		
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value="/get/student")
	public ResponseEntity<List<Student>>  getStudentAll() {
		
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.ACCEPTED);
	}
}
