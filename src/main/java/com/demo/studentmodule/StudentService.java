package com.demo.studentmodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;




@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	

	public List<Student> listAll() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}


	public Student get(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}


	public void save(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
	}


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
