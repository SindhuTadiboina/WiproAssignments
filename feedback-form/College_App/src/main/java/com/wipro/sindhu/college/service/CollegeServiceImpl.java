package com.wipro.sindhu.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sindhu.college.entities.College;
import com.wipro.sindhu.college.repo.College_Repository;


@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private College_Repository collegeRepository;

    @Override
    public List<College> getAll() {
        return collegeRepository.findAll();
    }

    @Override
    public void save(College college) {
        collegeRepository.save(college);
    }
    
    @Override
	public College getById(Long id) {
		return collegeRepository.findById(id).orElse(null);
	}
    
    @Override
    public void delete(Long id) {
    	collegeRepository.deleteById(id);
    }
}
