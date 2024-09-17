package com.oks.jpa.demo.service;

import java.util.List;
import java.util.Optional;

import com.oks.jpa.demo.vo.UserVo;

public interface UserService {
	UserVo saveUser(UserVo userVo);
	UserVo findUserById(Long id);
	List<UserVo> findAllUser();
	UserVo updateUser(UserVo e);
}
