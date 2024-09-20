package com.coder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}