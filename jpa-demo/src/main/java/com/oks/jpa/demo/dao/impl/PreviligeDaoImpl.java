package com.oks.jpa.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oks.jpa.demo.dao.PreviligeDao;
import com.oks.jpa.demo.entity.Previlige;
import com.oks.jpa.demo.repository.PreviligeRepository;

@Component
public class PreviligeDaoImpl implements PreviligeDao {
	@Autowired
	private PreviligeRepository previligeRepository;

	@Override
	public List<Previlige> savePreviliges(List<Previlige> e) {
		return previligeRepository.saveAll(e);
	}

	@Override
	public List<Previlige> findAllPrevilige() {
		return previligeRepository.findAll();
	}

	@Override
	public List<Previlige> findByPreviligeIn(List<Long> pvlId) {
		return previligeRepository.findByIdIn(pvlId);
	}

	@Override
	public Optional<Previlige> findPreviligeById(Long id) {		
		return previligeRepository.findById(id);
	}
	
	

}
