package com.himes.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
	
	@GetMapping("/users/agree")
	public String agreeForJoin() {
		return "users/agree";
	}
	
	@PostMapping("/users/agreed")
	public String agreed() {
		return "users/login";
	}
}
