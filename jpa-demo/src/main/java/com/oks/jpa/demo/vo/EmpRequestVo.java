package com.oks.jpa.demo.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpRequestVo {
	private List<Long> previligeIdList;
	private EmpVo empVo;
}
