package com.oks.jpa.demo.vo;

import java.util.List;

import com.oks.jpa.demo.entity.Previlige;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String job;
	private float salary;
	List<Previlige> previliges;

}
