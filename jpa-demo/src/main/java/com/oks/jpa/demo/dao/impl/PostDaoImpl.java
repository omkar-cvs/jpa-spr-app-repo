package com.oks.jpa.demo.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oks.jpa.demo.dao.PostDao;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.repository.PostRepository;
@Component
public class PostDaoImpl implements PostDao {
	@Autowired
	private PostRepository postRepository;
	 
	@Override
	public Post savePost(Post p) {
		return null;
	}

	@Override
	public Optional<Post> findPostById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Post> findAllPost() {
		return postRepository.findAll();
	}

	@Override
	public Post updatePost(Post p) {
		return null;
	}

	@Override
	public List<Post> saveAllPost(Set<Post> p) {
		
		return postRepository.saveAll(p);
	}

	@Override
	public List<Post> findAllPostByUserId(Long Id) {
		return null;
	}

}
