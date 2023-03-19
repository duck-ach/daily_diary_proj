package com.himes.diary.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.himes.diary.domain.DailyDTO;

@Mapper
public interface DailyMapper {
	public int insertDaily(DailyDTO dto);
}
