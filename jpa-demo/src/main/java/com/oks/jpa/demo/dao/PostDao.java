package com.oks.jpa.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.oks.jpa.demo.entity.Post;

public interface PostDao {
	Post savePost(Post p);

	Optional<Post> findPostById(Long id);

	List<Post> findAllPost();

	Post updatePostById(Post p);

	List<Post> saveAllPost(Set<Post> p);

	List<Post> findAllPostByUserId(Long Id);

	void deletePostById(Long id);

	void postDeleteById(Long id);
}
