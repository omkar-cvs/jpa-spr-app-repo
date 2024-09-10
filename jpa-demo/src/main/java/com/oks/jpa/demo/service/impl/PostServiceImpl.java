package com.oks.jpa.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.event.spi.PersistContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.mapper.PostMapper;
import com.oks.jpa.demo.dao.mapper.UserMapper;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.repository.PostRepository;
import com.oks.jpa.demo.repository.UserRepository;
import com.oks.jpa.demo.service.PostService;
import com.oks.jpa.demo.vo.PostVo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Service
public class PostServiceImpl implements PostService {
	//@PersistenceContext
	//EntityManager entityManager;
	@Autowired
	PostRepository postRepository; 
	@Autowired
	UserRepository userRepository;
	@Override


	public PostVo savePost(PostVo pv,Long userId) {
		Optional<User> userOpt=userRepository.findById(userId);
		PostVo postVoSaved=null;
			if(userOpt.isPresent()) {		
				Post post=PostMapper.INSTANCE.convertVOtoDOForPost(pv);		
				post.setUser(userOpt.get());
				Post postSaved=null;
				postSaved=postRepository.save(post); 		
				postVoSaved=PostMapper.INSTANCE.convertDOtoVOForPost(postSaved);	
			}
		return postVoSaved;
	}

	public PostVo savePostTemp(PostVo pv) {
		
		User u=userRepository.findById(1l).get();
		//Post post=new Post("Java", "Programing Language", u);
		//postRepository.save(post); 
		
		return null;
	}
	@Override
	public Optional<PostVo> findPostById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<PostVo> findAllPost() {
		return null;
	}

	@Override
	public PostVo updatePost(PostVo pv) {
		return null;
	}

}

