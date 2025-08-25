package com.wipro.sindhu.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.sindhu.college.entities.College;


@Repository
public interface College_Repository extends JpaRepository<College, Long> {

}
