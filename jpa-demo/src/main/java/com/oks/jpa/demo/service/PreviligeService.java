package com.oks.jpa.demo.service;

import java.util.List;

import com.oks.jpa.demo.entity.Previlige;
import com.oks.jpa.demo.vo.PreviligeRequestVo;
import com.oks.jpa.demo.vo.PreviligeVo;

public interface PreviligeService {
	List<PreviligeVo> savePrevilige(PreviligeRequestVo prv);
	List<PreviligeVo> findAllPrevilige();
	PreviligeVo findPreviligeById(Long id);
}
