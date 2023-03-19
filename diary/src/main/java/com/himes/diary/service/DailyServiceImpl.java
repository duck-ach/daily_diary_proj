package com.himes.diary.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himes.diary.domain.DailyDTO;
import com.himes.diary.mapper.DailyMapper;

@Service
public class DailyServiceImpl implements DailyService {

	@Autowired
	private DailyMapper dailyMapper;
	
	@Override
	public List<DailyDTO> getDailies() {
		List<DailyDTO> dailies = new ArrayList<>();
		dailies = dailyMapper.selectDailies();
		return dailies;
	}
	
	@Override
	public void createDaily(DailyDTO dto) {
		dailyMapper.insertDaily(dto);
	}

}
