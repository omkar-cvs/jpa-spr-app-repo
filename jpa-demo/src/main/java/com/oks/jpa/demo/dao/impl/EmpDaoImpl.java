package com.oks.jpa.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oks.jpa.demo.dao.EmpDao;
import com.oks.jpa.demo.entity.Emp;
import com.oks.jpa.demo.repository.EmpRepository;

@Component
public class EmpDaoImpl implements EmpDao {
	@Autowired
	EmpRepository empRepository;

	@Override
	public Emp saveEmp(Emp e) {
		return empRepository.save(e);
	}

	@Override
	public List<Emp> findAllEmp() {
		return empRepository.findAll();
	}

	@Override
	public Optional<Emp> findEmpById(Long id) {
		return empRepository.findById(id);
	}

	@Override
	public void deleteEmpById(Long id) {
		empRepository.deleteById(id);		
	}
}
