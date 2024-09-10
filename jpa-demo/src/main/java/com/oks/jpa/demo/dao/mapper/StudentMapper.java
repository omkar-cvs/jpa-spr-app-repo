package com.oks.jpa.demo.dao.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.oks.jpa.demo.entity.Student;
import com.oks.jpa.demo.vo.StudentVo;

@Mapper
public  interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
	
	 Student   convertVoToDoforStudent(StudentVo studentVo);
	
	 StudentVo convertDoToVoforStudent(Student student);
}
