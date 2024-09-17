package com.oks.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oks.jpa.demo.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>{
	   
	   // @Query("select p from post p where post.user.id:=userId")
		//List<Post> findPostByUserId(@Param("userId") Long userId);
}
