package com.oks.jpa.demo.service;

import java.util.List;
import java.util.Optional;

import com.oks.jpa.demo.vo.PostVo;

public interface PostService {
	PostVo savePost(PostVo pv,Long userId);
	PostVo findPostById(Long id);
	List<PostVo> findAllPost();
	PostVo updatePostById(PostVo pv);
	void deletePostById(Long id);
	void postDeleteById(Long id);
}
