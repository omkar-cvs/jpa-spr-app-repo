package com.oks.jpa.demo.vo;

import java.util.Set;

import com.oks.jpa.demo.entity.Previlige;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
	private Long id;
	private String name;
	private String job;
	private float salary;
	Set<Previlige> previliges;

}
