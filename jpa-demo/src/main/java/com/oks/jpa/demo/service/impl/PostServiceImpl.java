package com.oks.jpa.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.PostDao;
import com.oks.jpa.demo.dao.mapper.PostMapper;
import com.oks.jpa.demo.dao.mapper.UserMapper;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.repository.PostRepository;
import com.oks.jpa.demo.repository.UserRepository;
import com.oks.jpa.demo.service.PostService;
import com.oks.jpa.demo.vo.PostVo;
import com.oks.jpa.demo.vo.UserVo;

@Service
public class PostServiceImpl implements PostService {
	// @PersistenceContext
	// EntityManager entityManager;
	@Autowired
	PostRepository postRepository;
	@Autowired
	UserRepository userRepository;

	@Autowired
	PostDao postDao;

	@Override
	public PostVo savePost(PostVo pv, Long userId) {
		Optional<User> userOpt = userRepository.findById(userId);
		PostVo postVoSaved = null;
		if (userOpt.isPresent()) {
			Post post = PostMapper.INSTANCE.convertVOtoDOForPost(pv);
			Post postSaved = null;
			post.setUser(userOpt.get());
			postSaved = postRepository.save(post);
			postVoSaved = PostMapper.INSTANCE.convertDOtoVOForPost(postSaved);
		}
		return postVoSaved;
	}

	@Override
	public PostVo findPostById(Long id) {
		Optional<Post> postOpt = postRepository.findById(id);
		PostVo pv = null;
		if (postOpt.isPresent()) {
			pv = PostMapper.INSTANCE.convertDOtoVOForPost(postOpt.get());
			System.out.println("pv.getPost : " + postOpt.get());
			// System.out.println("pv.getUser() : "+postOpt.get().getUser());
		}
		return pv;
	}

	@Override
	public List<PostVo> findAllPost() {
		return PostMapper.INSTANCE.convertDOtoVOForAllPost(postDao.findAllPost());
	}

	@Override
	public PostVo updatePostById(PostVo pv) {
		System.out.println("[02] controller--------------");
		Optional<Post> postOpt = postDao.findPostById(pv.getId());
		PostVo postVoSaved = null;
		if (postOpt.isPresent()) {
			Post post = postOpt.get();
			populatePost(pv, post);
			Post postSaved = postDao.updatePostById(post);
			postVoSaved = PostMapper.INSTANCE.convertDOtoVOForPost(postSaved);
		}
		return postVoSaved;
	}

	private Post populatePost(PostVo pv, Post p) {
		p.setTitle(pv.getTitle());
		p.setContents(pv.getContents());
		return p;
	}

	@Override
	public void deletePostById(Long id) {
		// this method call delete all post and related user
		// postDao.deletePostById(id);

		// this method call delete single post only
		this.postDeleteById(id);

	}

	@Override
	public void postDeleteById(Long id) {
		postDao.postDeleteById(id);
	}

}
