package com.oks.jpa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oks.jpa.demo.constants.Constants;
import com.oks.jpa.demo.service.PostService;
import com.oks.jpa.demo.vo.PostRequestVo;
import com.oks.jpa.demo.vo.PostResponseVo;
import com.oks.jpa.demo.vo.PostVo;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostService postService;
	@PostMapping("/save")
	public ResponseEntity<PostResponseVo> savePost(@RequestBody PostRequestVo postRequestVo) {
		List<PostVo> postVoList = new ArrayList<>();
		PostVo postVo=postService.savePost(postRequestVo.getPostVo(),postRequestVo.getUserId());
		postVoList.add(postVo);
		return new ResponseEntity<>(
				PostResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, postVoList),
				HttpStatus.OK);
	}
	@PostMapping("/find")
	public ResponseEntity<PostResponseVo> findPost(@RequestBody PostRequestVo postRequestVo) {
		List<PostVo> postVoList = new ArrayList<>();
		PostVo postVo=postService.findPostById(postRequestVo.getPostId());
		postVoList.add(postVo);
		return new ResponseEntity<>(
				PostResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, postVoList),
				HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<PostResponseVo> findAllPost() {
		List<PostVo> postVoList = postService.findAllPost();
		return new ResponseEntity<>(
				PostResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, postVoList),
				HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<PostResponseVo> updatePostById(@RequestBody PostRequestVo postRequestVo) {
		System.out.println("[01] controller--------------");
		List<PostVo> postVoList = new ArrayList<>();
		PostVo postVo=postService.updatePostById(postRequestVo.getPostVo());
		
		postVoList.add(postVo);
		return new ResponseEntity<>(
				PostResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, postVoList),
				HttpStatus.OK);
	}
	
	/* This method delete all post and related user*/	
	@PostMapping("/delete")
	public ResponseEntity<PostResponseVo> deletePostById(@RequestBody PostRequestVo postRequestVo) {
		List<PostVo> postVoList = new ArrayList<>();
		postService.deletePostById(postRequestVo.getPostId());	
		return new ResponseEntity<>(
				PostResponseVo.serviceResponse(Constants.SUCCESS_MESSAGE, Constants.SUCCESS_CODE, postVoList),
				HttpStatus.OK);
	}
	
	
	
}
