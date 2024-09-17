package com.oks.jpa.demo.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.oks.jpa.demo.entity.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {	
	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
	private String mailId;
	private String password;
	//  @JsonManagedReference //not working proper	
	List<Post> post;
}
