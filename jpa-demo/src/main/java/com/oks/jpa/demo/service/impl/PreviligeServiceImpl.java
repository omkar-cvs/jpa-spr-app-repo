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

	@Override
	public List<PreviligeVo> savePrevilige(PreviligeRequestVo prv) {
		Optional<Emp> empOpt = empDao.findEmpById(prv.getEmpId());
		Set<Emp> empSet = new HashSet();
		List<Previlige> previliges = new ArrayList();
		if (empOpt.isPresent()) {
			Emp emp = empOpt.get();
			empSet.add(emp);

			List<Previlige> previligeList = PreviligeMapper.INSTANCE.convertVoToDoForPrevilige(prv.getPreviligeVo());
			for (Previlige previlige : previligeList) {		
				previliges.add(new Previlige(previlige.getName(), previlige.getCost()));
			}
		}

		return PreviligeMapper.INSTANCE.convertDoToVoForPrevilige(previligeDao.savePreviliges(previliges));
	}

	@Override
	public List<PreviligeVo> findAllPrevilige() {
		return PreviligeMapper.INSTANCE.convertDoToVoForPrevilige(previligeDao.findAllPrevilige());
	}

}
