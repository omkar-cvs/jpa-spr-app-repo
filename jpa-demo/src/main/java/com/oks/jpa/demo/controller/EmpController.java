package com.oks.jpa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.jpa.demo.constants.Constants;
import com.oks.jpa.demo.service.EmpService;
import com.oks.jpa.demo.vo.EmpRequestVo;
import com.oks.jpa.demo.vo.EmpResponseVo;
import com.oks.jpa.demo.vo.EmpVo;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empService;
	
	@PostMapping("/save")
	public ResponseEntity<EmpResponseVo> saveEmp(@RequestBody EmpRequestVo empRequestVo){
		List<EmpVo> empVoList=new ArrayList();
		EmpVo empVo=empService.saveEmp(empRequestVo);
		empVoList.add(empVo);
		return new ResponseEntity<>(EmpResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, empVoList),
				HttpStatus.OK);
	}
	
	@PostMapping("/find")
	public ResponseEntity<EmpResponseVo> findEmpById(@RequestBody EmpRequestVo empRequestVo){
		List<EmpVo> empVoList=new ArrayList<>();
		EmpVo empVo=empService.findEmpById(empRequestVo.getEmpId());
		empVoList.add(empVo);
			return new ResponseEntity<>(EmpResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, empVoList),
				HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<EmpResponseVo> findAllEmp(){
		List<EmpVo> empVoList=empService.findAllEmp();
			return new ResponseEntity<>(EmpResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, empVoList),
				HttpStatus.OK);
	}
	
	
}
