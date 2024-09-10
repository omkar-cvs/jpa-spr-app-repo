package com.oks.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oks.jpa.demo.entity.Student;

public interface StudentServiceRepository extends JpaRepository<Student, Long>{

}
