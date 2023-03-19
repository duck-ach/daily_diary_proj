package com.himes.diary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.himes.diary.domain.DailyDTO;

@Mapper
public interface DailyMapper {
	public List<DailyDTO> selectDailies();
	public int insertDaily(DailyDTO dto);
}
