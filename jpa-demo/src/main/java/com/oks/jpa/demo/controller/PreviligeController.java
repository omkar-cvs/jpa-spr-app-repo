package com.oks.jpa.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.jpa.demo.constants.Constants;
import com.oks.jpa.demo.service.PreviligeService;
import com.oks.jpa.demo.vo.PreviligeRequestVo;
import com.oks.jpa.demo.vo.PreviligeResponseVo;
import com.oks.jpa.demo.vo.PreviligeVo;

@RestController
@RequestMapping("/emp/previliges")
public class PreviligeController {

	@Autowired
	PreviligeService previligeService;
	
	@PostMapping(value="/save",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PreviligeResponseVo> savePrevilige(@RequestBody PreviligeRequestVo previligeRequestVo){
		List<PreviligeVo> previligeVoList=previligeService.savePrevilige(previligeRequestVo);	;
		return new ResponseEntity<>(PreviligeResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, previligeVoList),
				HttpStatus.OK);
	}
	
	@PostMapping(value="/find", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PreviligeResponseVo> findPreviligeById(@RequestBody PreviligeRequestVo previligeRequestVo){
		List<PreviligeVo> previligeVoList=new ArrayList<>();
		PreviligeVo previligeVo=previligeService.findPreviligeById(previligeRequestVo.getPreviligeId());
		previligeVoList.add(previligeVo);
			return new ResponseEntity<>(PreviligeResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, previligeVoList),
				HttpStatus.OK);
	}
	@GetMapping(value="/findAll")
	public ResponseEntity<PreviligeResponseVo> findAllPrevilige(){
		List<PreviligeVo> previligeVoList=previligeService.findAllPrevilige();
			return new ResponseEntity<>(PreviligeResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, previligeVoList),
				HttpStatus.OK);
	}
}
