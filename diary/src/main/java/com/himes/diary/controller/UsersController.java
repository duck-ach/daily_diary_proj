package com.himes.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
	
	@GetMapping("/users/agree")
	public String agreeForJoin() {
		return "users/agree";
	}
	
	@GetMapping("/users/agreed")
	public String agreed() {
		return "users/login";
	}
}
