package com.oks.jpa.demo.vo;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestVo {
	 private Long userId;
	// private Set<PostVo> postVo;
	 private PostVo postVo;
}
