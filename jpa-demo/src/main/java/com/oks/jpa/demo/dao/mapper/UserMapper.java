package com.oks.jpa.demo.dao.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.vo.UserVo;


@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	  User convertVOtoDOForUser(UserVo userVo);

	  UserVo convertDOtoVOForUser(User user);
	
	  List<UserVo> convertDOtoVOForAllEmp(List<User> userList);
}


