package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HomeController {
	
	//home画面表示
	@GetMapping("/home")
	public String getHome() {
		return "user/home";
	}

}
