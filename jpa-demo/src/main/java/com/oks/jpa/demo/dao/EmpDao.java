package com.oks.jpa.demo.dao;

import java.util.List;
import java.util.Optional;

import com.oks.jpa.demo.entity.Emp;

public interface EmpDao {
	Emp saveEmp(Emp e);
	List<Emp> findAllEmp();
	Optional<Emp> findEmpById(Long id);
	void deleteEmpById(Long id);
}
