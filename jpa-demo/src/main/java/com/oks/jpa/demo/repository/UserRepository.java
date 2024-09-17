package com.oks.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oks.jpa.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//List<User> findAllUser();
}
