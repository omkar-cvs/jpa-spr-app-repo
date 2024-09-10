package com.oks.jpa.demo.vo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostVo { 
	Long id;	
	private String title;
	private String contents;
	//private String userId;
	//@JsonBackReference
	//UserVo userVo;
}
