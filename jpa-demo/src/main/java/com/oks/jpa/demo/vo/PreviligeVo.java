package com.oks.jpa.demo.vo;

import java.util.List;

import com.oks.jpa.demo.entity.Emp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PreviligeVo {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private float cost;		
	List<Emp> employees;
}
