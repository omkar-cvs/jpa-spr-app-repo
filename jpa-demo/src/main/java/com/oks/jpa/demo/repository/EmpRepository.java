package com.oks.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oks.jpa.demo.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long>{

}
