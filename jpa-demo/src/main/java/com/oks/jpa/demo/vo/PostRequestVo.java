package com.oks.jpa.demo.vo;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestVo {
	private static final long serialVersionUID = 1L;
	 private Long userId;
	 private Long postId;
	 private PostVo postVo;
}
