package com.oks.jpa.demo.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreviligeRequestVo {
  private  Long empId;
  private  List<PreviligeVo> previligeVo;
}
