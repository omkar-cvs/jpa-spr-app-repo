package com.oks.jpa.demo.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "serviceResponse")
public class UserResponseVo {
	private String message;
	private String status;
	private List<UserVo> userVo;
}
