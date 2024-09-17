package com.oks.jpa.demo.dao.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.vo.PostVo;

@Mapper
public interface PostMapper {
	PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);
	
	  Post convertVOtoDOForPost(PostVo postVo);

	  PostVo convertDOtoVOForPost(Post post);
	
	  List<PostVo> convertDOtoVOForAllPost(List<Post> postList);
	  
	  List<Post> convertVOtodDOForAllPost(List<PostVo> postVoList);
}
