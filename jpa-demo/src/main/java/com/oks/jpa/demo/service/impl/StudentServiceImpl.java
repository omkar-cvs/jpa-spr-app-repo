package com.oks.jpa.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.mapper.StudentMapper;
import com.oks.jpa.demo.entity.Student;
import com.oks.jpa.demo.repository.StudentServiceRepository;
import com.oks.jpa.demo.service.StudentService;
import com.oks.jpa.demo.vo.StudentVo;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentServiceRepository studentServiceRepository; 
	@Override
	public StudentVo saveStudent(StudentVo studentVo) {		
		Student s=StudentMapper.INSTANCE.convertVoToDoforStudent(studentVo);		
		Student stdSaved=studentServiceRepository.save(s);
		StudentVo vo=StudentMapper.INSTANCE.convertDoToVoforStudent(stdSaved);
		return vo;
	}

}
