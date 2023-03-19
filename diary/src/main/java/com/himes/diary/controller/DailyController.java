package com.himes.diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.himes.diary.domain.DailyDTO;
import com.himes.diary.service.DailyService;

@Controller
public class DailyController {
	@Autowired
	private DailyService dailyService;
	
	
	@GetMapping("/daily")
	public String dailis() {
		return "daily/list";
	}
	
	@GetMapping("/daily/write")
	public String dailyWriteForm() {
		return "daily/write";
	}
	
	//* 작성 후, 작성된 페이지로 이동할 것
	@PostMapping("/daily/add")
	public String createDaily(DailyDTO dto) {
		dailyService.createDaily(dto);
		return "redirect:/daily";
	}
}
