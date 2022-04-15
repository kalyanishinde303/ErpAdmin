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

import com.mphasis.erp.service.FacultyService;

@RestController
public class FaultyController {

	@Autowired
	FacultyService facultyService;
	
	@PostMapping(value="/save/faculty", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Faculty>  saveFaculty(@RequestBody Faculty faculty) {
		//Call service method
		
		return new ResponseEntity<Faculty>(facultyService.saveFaculty(faculty), HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value="/get/faculty")
	public ResponseEntity<List<Faculty>>  getStudentAll() {
		
		return new ResponseEntity<List<Faculty>>(facultyService.getAllFaculty(), HttpStatus.ACCEPTED);
	}
}
