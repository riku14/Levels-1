package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	//ログイン画面に遷移
	@GetMapping("/login")
	public String getLogin() {
		return "login/login";
	}
	
	@PostMapping("/login")
	public String postLogin() {
		return "redirect:/user/home";
	}
}
