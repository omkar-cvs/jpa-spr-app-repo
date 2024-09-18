package com.oks.jpa.demo.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.PostDao;
import com.oks.jpa.demo.dao.UserDao;
import com.oks.jpa.demo.dao.mapper.PostMapper;
import com.oks.jpa.demo.dao.mapper.UserMapper;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.service.UserService;
import com.oks.jpa.demo.vo.PostVo;
import com.oks.jpa.demo.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	PostDao postDao;
	


	@Override
	public UserVo saveUser(UserVo userVo) {
		User user=UserMapper.INSTANCE.convertVOtoDOForUser(userVo);
		User userSaved=userDao.saveUser(user);				
		UserVo userVoSaved=UserMapper.INSTANCE.convertDOtoVOForUser(userSaved);		
		return userVoSaved;
	}
	
	@Override
	public UserVo findUserById(Long id) {	
		Optional<User> userOpt=userDao.findUserById(id);	
		UserVo uv=null;
		
		if(userOpt.isPresent()) {
			//System.out.println("posts -> userOpt.get() : "+userOpt.get().getPosts());			
			uv=UserMapper.INSTANCE.convertDOtoVOForUser(userOpt.get());
			System.out.println("--------------------ssssssssssss-----------------");
			System.out.println("posts -> userOpt.get() : "+userOpt.get().getPosts());			
			uv.setPost(userOpt.get().getPosts());
			System.out.println("-------------------eeeeeeeeeeeeeee-------------------");
		}
		return uv;		
	}

	@Override
	public List<UserVo> findAllUser() {		
		return UserMapper.INSTANCE.convertDOtoVOForAllUser(userDao.findAllUser());
	}

	@Override
	public UserVo updateUserById(UserVo uv) {
		Optional<User> userOpt=userDao.findUserById(uv.getId());
		UserVo userVoSaved=null;
		if(userOpt.isPresent()) {
			User user=userOpt.get();
			user=populateUserFromUserVo(uv,user);
			User userSaved=userDao.saveUser(user);				
			userVoSaved=UserMapper.INSTANCE.convertDOtoVOForUser(userSaved);				
		}
		return userVoSaved;
	}

	@Override
	public void deleteUserById(Long id) {
		userDao.deleteUserById(id);		
	}
	
	private User populateUserFromUserVo(UserVo uv,User u) {	
		u.setMailId(uv.getMailId());
		u.setPassword(uv.getPassword());
		return u;
	}
	
}
