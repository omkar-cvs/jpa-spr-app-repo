package com.oks.jpa.demo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.EmpDao;
import com.oks.jpa.demo.dao.PreviligeDao;
import com.oks.jpa.demo.dao.mapper.PreviligeMapper;
import com.oks.jpa.demo.entity.Emp;
import com.oks.jpa.demo.entity.Previlige;
import com.oks.jpa.demo.service.PreviligeService;
import com.oks.jpa.demo.vo.PreviligeRequestVo;
import com.oks.jpa.demo.vo.PreviligeVo;

@Service
public class PreviligeServiceImpl implements PreviligeService {
	@Autowired
	PreviligeDao previligeDao;
	@Autowired
	EmpDao empDao;
	
	//updating in exiting one Bidirection 
	@Override
	public List<PreviligeVo> savePrevilige(PreviligeRequestVo prv) {	
			   List<Previlige> previliges = PreviligeMapper.INSTANCE.convertVoToDoForPrevilige(prv.getPreviligeVo());
		return PreviligeMapper.INSTANCE.convertDoToVoForPrevilige(previligeDao.savePreviliges(previliges));
	}	
	
	@Override
	public List<PreviligeVo> findAllPrevilige() {
		return PreviligeMapper.INSTANCE.convertDoToVoForPrevilige(previligeDao.findAllPrevilige());
	}

	@Override
	public PreviligeVo findPreviligeById(Long id) {
		Optional<Previlige> pvgOpt=previligeDao.findPreviligeById(id);
		PreviligeVo previlige=null;
		if(pvgOpt.isPresent()) {			
			previlige =PreviligeMapper.INSTANCE.convertDoToVoForPrevilige(pvgOpt.get());
			System.out.println("pvgOpt.get().getEmployees() : "+pvgOpt.get().getEmployees());
			//PreviligeMapper.INSTANCE.convertDoToVoForPreviligeListToSet(previlige.getEmployees());
			//previlige.setEmployees();
			
		}
		return previlige;
	}

}
