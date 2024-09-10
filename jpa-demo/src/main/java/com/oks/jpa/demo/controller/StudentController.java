package com.oks.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.jpa.demo.service.StudentService;
import com.oks.jpa.demo.vo.StudentVo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService sutService;
	@PostMapping("/save")
	public StudentVo saveStudent(@RequestBody StudentVo studentVo) {
		return sutService.saveStudent(studentVo);
	}
}
