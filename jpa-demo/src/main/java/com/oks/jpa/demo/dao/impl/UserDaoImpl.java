package com.oks.jpa.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oks.jpa.demo.dao.UserDao;
import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.repository.UserRepository;

@Component
public class UserDaoImpl implements UserDao{
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public  Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User u) {
		return userRepository.save(u);
	}
}
