
package com.mphasis.erp.service;

import java.util.List;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.erp.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	LibraryRepository libraryRepository;
	public Library saveLibrary(Library library) {
		return libraryRepository.save(library);
	}
	public  List<Library> getAllLibrary() {
		return (List<Library>) libraryRepository.findAll();
	}
}
