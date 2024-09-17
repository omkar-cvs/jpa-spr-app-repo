package com.oks.jpa.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestVo {
	 private static final long serialVersionUID = 1L;
	 private Long userId;
	 private UserVo userVo;
}


