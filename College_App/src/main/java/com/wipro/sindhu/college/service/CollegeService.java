package com.wipro.sindhu.college.service;

import java.util.List;

import com.wipro.sindhu.college.entities.College;


public interface CollegeService {
	
	public List<College> getAll();

	void save(College college);

	College getById(Long id);

	void delete(Long id);
	
}
