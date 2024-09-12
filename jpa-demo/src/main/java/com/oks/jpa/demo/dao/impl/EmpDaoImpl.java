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
		/*
		Set<Previlige> pset=new HashSet();
		Previlige p1=new Previlige("Car",500);
		Previlige p2=new Previlige("Flat",1500);
		Previlige p3=new Previlige("Club",200);
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		Emp emp=new Emp("Ram","SE",9999,pset);
		*/
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
}
