package com.oks.jpa.demo.service;

import java.util.List;
import java.util.Optional;

import com.oks.jpa.demo.vo.PostVo;

public interface PostService {
	PostVo savePost(PostVo pv,Long userId);
	Optional<PostVo> findPostById(Long id);
	List<PostVo> findAllPost();
	PostVo updatePost(PostVo pv);
}
