package com.oks.jpa.demo.service;

import java.util.List;

import com.oks.jpa.demo.vo.EmpRequestVo;
import com.oks.jpa.demo.vo.EmpVo;

public interface EmpService {
	EmpVo saveEmp(EmpRequestVo empRequestVo);
	List<EmpVo> findAllEmp();
    EmpVo findEmpById(Long id);
    void deleteEmpById(Long id);
    EmpVo allocatePreviligeToEmp(EmpRequestVo empRequestVo);
	
}
