package com.wipro.sindhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sindhu.entites.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
