package com.oks.jpa.demo.dao.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.oks.jpa.demo.entity.Emp;
import com.oks.jpa.demo.vo.EmpVo;

@Mapper
public interface EmpMapper {
	EmpMapper INSTANCE=Mappers.getMapper(EmpMapper.class);	
	Emp convertVoToDoForEmp(EmpVo empVo);
	EmpVo convertDoToVoForEmp(Emp empVo);	
	List<EmpVo> convertVoToDoForAllEmp(List<Emp> empList);
	List<Emp> convertDoToVoForAllEmp(List<EmpVo> empVoList);
}
