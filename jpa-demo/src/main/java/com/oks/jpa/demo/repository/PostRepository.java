package com.oks.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oks.jpa.demo.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
