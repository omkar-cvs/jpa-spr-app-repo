package com.oks.jpa.demo.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpRequestVo {
	private static final long serialVersionUID = 1L;
	private Long empId;
	private List<Long> previligeIdList;
	private EmpVo empVo;
}
