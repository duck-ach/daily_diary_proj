package com.himes.diary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.himes.diary.domain.DailyDTO;

@Mapper
public interface DailyMapper {
	public List<DailyDTO> selectDailies();
	public DailyDTO selectDaily(int dNo);
	public int insertDaily(DailyDTO dto);
	public int updateDaily(DailyDTO dto);
	public int deleteDaily(int dNo);
}
