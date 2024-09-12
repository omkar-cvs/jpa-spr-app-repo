package com.oks.jpa.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oks.jpa.demo.entity.Previlige;

public interface PreviligeRepository extends JpaRepository<Previlige, Long>{
	
	List<Previlige> findByIdIn(List<Long>  pvlId);

}
