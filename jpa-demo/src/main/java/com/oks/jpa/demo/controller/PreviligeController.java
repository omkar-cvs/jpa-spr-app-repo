package com.oks.jpa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.jpa.demo.constants.Constants;
import com.oks.jpa.demo.service.PreviligeService;
import com.oks.jpa.demo.vo.EmpResponseVo;
import com.oks.jpa.demo.vo.PreviligeRequestVo;
import com.oks.jpa.demo.vo.PreviligeResponseVo;
import com.oks.jpa.demo.vo.PreviligeVo;

@RestController
@RequestMapping("/emp/previliges")
public class PreviligeController {

	@Autowired
	PreviligeService previligeService;
	
	@PostMapping("/save")
	public ResponseEntity<PreviligeResponseVo> savePrevilige(@RequestBody PreviligeRequestVo previligeRequestVo){
		List<PreviligeVo> previligeVoList=previligeService.savePrevilige(previligeRequestVo);	;
		return new ResponseEntity<>(PreviligeResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, previligeVoList),
				HttpStatus.OK);
	}
	
	@PostMapping("/findAll")
	public ResponseEntity<PreviligeResponseVo> findAllPrevilige(){
		List<PreviligeVo> previligeVoList=previligeService.findAllPrevilige();
			return new ResponseEntity<>(PreviligeResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, previligeVoList),
				HttpStatus.OK);
	}
}
