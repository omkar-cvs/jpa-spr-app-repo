package com.oks.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oks.jpa.demo.entity.Post;

import jakarta.transaction.Transactional;

public interface PostRepository extends JpaRepository<Post,Long>{
	   
	   // @Query("select p from post p where post.user.id:=userId")
		//List<Post> findPostByUserId(@Param("userId") Long userId);
     
		@Transactional
		@Modifying
		@Query(value ="delete from Post p where p.POST_ID=:postId",nativeQuery = true)
		void postDeleteById(@Param("postId") Long postId); 		
		
}
