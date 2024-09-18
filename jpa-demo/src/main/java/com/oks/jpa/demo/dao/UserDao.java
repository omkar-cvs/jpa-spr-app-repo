package com.oks.jpa.demo.dao;

import java.util.List;
import java.util.Optional;

import com.oks.jpa.demo.entity.User;

public interface UserDao {	
	User saveUser(User e);
	Optional<User> findUserById(Long id);
	List<User> findAllUser();
	User updateUser(User e);
	void deleteUserById(Long id);

}
