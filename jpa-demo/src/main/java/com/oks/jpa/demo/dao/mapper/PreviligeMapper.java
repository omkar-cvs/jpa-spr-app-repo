package com.oks.jpa.demo.dao.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.oks.jpa.demo.entity.Previlige;
import com.oks.jpa.demo.vo.PreviligeVo;

@Mapper
public interface PreviligeMapper {
	PreviligeMapper INSTANCE = Mappers.getMapper(PreviligeMapper.class);

	Previlige convertVoToDoForPrevilige(PreviligeVo pv);

	PreviligeVo convertDoToVoForPrevilige(Previlige p);

	List<PreviligeVo> convertDoToVoForPrevilige(List<Previlige> pl);
	
	List<Previlige> convertVoToDoForPrevilige(List<PreviligeVo> plv);
}
