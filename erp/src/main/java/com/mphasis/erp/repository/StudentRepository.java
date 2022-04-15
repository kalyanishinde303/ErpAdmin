package com.mphasis.erp.repository;

import org.springframework.data.repository.CrudRepository;

import com.mphasis.erp.controller.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}