
package com.mphasis.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.erp.controller.Admin;
import com.mphasis.erp.controller.Faculty;
import com.mphasis.erp.controller.Student;
import com.mphasis.erp.repository.AdminRepository;
import com.mphasis.erp.repository.FacultyRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	public  List<Admin> getAllAdmin() {
		
				return (List<Admin>) adminRepository.findAll();
		
	}
	
	public  void deleteAdmin(String aname) {
		  adminRepository.deleteAll();
	}
}
