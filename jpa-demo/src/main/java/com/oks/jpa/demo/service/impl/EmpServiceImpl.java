package com.oks.jpa.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.EmpDao;
import com.oks.jpa.demo.dao.PreviligeDao;
import com.oks.jpa.demo.dao.mapper.EmpMapper;
import com.oks.jpa.demo.entity.Emp;
import com.oks.jpa.demo.entity.Previlige;
import com.oks.jpa.demo.service.EmpService;
import com.oks.jpa.demo.vo.EmpRequestVo;
import com.oks.jpa.demo.vo.EmpVo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao empDao;
	@Autowired
	PreviligeDao previligeDao;
	@Override
	public EmpVo saveEmp(EmpRequestVo empRequestVo) {
		Emp emp=EmpMapper.INSTANCE.convertVoToDoForEmp(empRequestVo.getEmpVo());
		if(empRequestVo.getPreviligeIdList()!=null) {
			List<Previlige> pvl=previligeDao.findByPreviligeIn(empRequestVo.getPreviligeIdList());
			emp.setPreviliges(pvl);
		}
		return EmpMapper.INSTANCE.convertDoToVoForEmp(empDao.saveEmp(emp));
	}

	@Override
	public List<EmpVo> findAllEmp() {		
		return EmpMapper.INSTANCE.convertVoToDoForAllEmp(empDao.findAllEmp()); 
	}

	@Override
	public EmpVo findEmpById(Long id) {
		return EmpMapper.INSTANCE.convertDoToVoForEmp(empDao.findEmpById(id).get());
	}

	@Override
	public void deleteEmpById(Long id) {
		empDao.deleteEmpById(id);		
	}

	@Override
	public EmpVo allocatePreviligeToEmp(EmpRequestVo empRequestVo) {
		List<Previlige> pvl=previligeDao.findByPreviligeIn(empRequestVo.getPreviligeIdList());
		Optional<Emp> empOpt=empDao.findEmpById(empRequestVo.getEmpId());
		Emp emp=null;
		if(empOpt.isPresent()) {
			emp=empOpt.get();
			emp.setPreviliges(pvl);
			emp=empDao.saveEmp(emp);
		}
		return EmpMapper.INSTANCE.convertDoToVoForEmp(emp);
	}

}
