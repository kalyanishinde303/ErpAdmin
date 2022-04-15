package com.mphasis.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.erp.controller.Faculty;
import com.mphasis.erp.controller.Student;
import com.mphasis.erp.repository.FacultyRepository;

@Service
public class FacultyService {

	@Autowired
	FacultyRepository facultyRepository;
	public Faculty saveFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}
	public  List<Faculty> getAllFaculty() {
		return (List<Faculty>) facultyRepository.findAll();
	}
	
	public  void deleteFaculty(int facultyID) {
		  facultyRepository.deleteById(facultyID);
	}
}
