package com.oks.jpa.demo.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreviligeRequestVo {
  private static final long serialVersionUID = 1L;
  private  Long empId;
  private  List<PreviligeVo> previligeVo;
  private  Long previligeId;
}
