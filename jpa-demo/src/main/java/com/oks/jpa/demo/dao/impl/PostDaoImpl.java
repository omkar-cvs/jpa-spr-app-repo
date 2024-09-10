package com.oks.jpa.demo.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.oks.jpa.demo.dao.PostDao;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.repository.PostRepository;

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
		return null;
	}

	@Override
	public Post updatePost(Post p) {
		return null;
	}

	@Override
	public List<Post> saveAllPost(Set<Post> p) {
		
		return postRepository.saveAll(p);
	}

}
