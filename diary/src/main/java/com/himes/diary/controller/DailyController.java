package com.himes.diary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.himes.diary.domain.DailyDTO;
import com.himes.diary.service.DailyService;

@Controller
public class DailyController {
	@Autowired
	private DailyService dailyService;
	
	
	@GetMapping("/daily")
	public String getDailies(Model model) {
		model.addAttribute("dailies", dailyService.getDailies());
		return "daily/list";
	}
	
	@GetMapping("/daily/detail")
	public String getDaily(Model model, int dNo) {
		model.addAttribute("daily", dailyService.getDaily(dNo));
		return "daily/detail";
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
	
	@GetMapping("/daily/editForm")
	public String goUpdateDailyForm(Model model, int dNo) {
		model.addAttribute("daily", dailyService.getDaily(dNo));
		return "daily/edit";
	}
	
	@PostMapping("/daily/edit")
	public String updateDaily(DailyDTO dto) {
		dailyService.updateDaily(dto);
		return "redirect:/daily";
	}
	
	@PostMapping("/daily/remove")
	public String deleteDaily(int dNo) {
		dailyService.deleteDaily(dNo);
		return "redirect:/daily";
	}
}
