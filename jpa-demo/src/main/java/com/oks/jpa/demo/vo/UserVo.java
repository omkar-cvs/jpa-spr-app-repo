package com.oks.jpa.demo.vo;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {	
	private Long id;
    private String name;
	private String mailId;
	private String password;
	@JsonManagedReference
	Set<PostVo> postVo;
}
