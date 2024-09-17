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
import com.oks.jpa.demo.service.UserService;
import com.oks.jpa.demo.vo.UserRequestVo;
import com.oks.jpa.demo.vo.UserResponseVo;
import com.oks.jpa.demo.vo.UserVo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<UserResponseVo> saveUser(@RequestBody UserRequestVo userRequestVo) {
		List<UserVo> userVoList = new ArrayList<>();
		UserVo userVo=userService.saveUser(userRequestVo.getUserVo());
		userVoList.add(userVo);
		return new ResponseEntity<>(
				UserResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, userVoList),
				HttpStatus.OK);
	}
	

	@PostMapping("/find")
	public ResponseEntity<UserResponseVo> findUserById(@RequestBody UserRequestVo userRequestVo) {
		List<UserVo> userVoList = new ArrayList<>();
		UserVo userVo=userService.findUserById(userRequestVo.getUserId());
		userVoList.add(userVo);
		return new ResponseEntity<>(
				UserResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, userVoList),
				HttpStatus.OK);
	}
	

}
