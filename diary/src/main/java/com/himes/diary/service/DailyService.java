package com.himes.diary.service;

import java.util.List;

import com.himes.diary.domain.DailyDTO;

public interface DailyService {
	public List<DailyDTO> getDailies();
	public DailyDTO getDaily(int dNo);
	public void createDaily(DailyDTO dto);
}
