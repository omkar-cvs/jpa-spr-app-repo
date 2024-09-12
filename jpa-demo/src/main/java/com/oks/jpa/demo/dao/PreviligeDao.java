package com.oks.jpa.demo.dao;

import java.util.List;

import com.oks.jpa.demo.entity.Previlige;

public interface PreviligeDao {
	List<Previlige> savePreviliges(List<Previlige> e);
	List<Previlige> findAllPrevilige();
	List<Previlige> findByPreviligeIn(List<Long>  pvlId);
}
