package com.oks.jpa.demo.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentVo {
	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
}
