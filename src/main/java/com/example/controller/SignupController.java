package com.example.controller;

import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.application.service.UserApplicationServce;
//import com.example.domain.user.model.MUser;
//import com.example.domain.user.service.UserService;
import com.example.form.GroupOrder;
import com.example.form.SignupForm;
import com.example.user.model.Users;
import com.example.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {
	
	@Autowired
	private UserApplicationServce userApplicationServce;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//user登録画面表示
	@GetMapping("/signup")
	public String getSignup(Model model, @ModelAttribute SignupForm form) {
		
		return "user/signup";
		
	}
	
	//ユーザー登録処理
	@PostMapping("/signup")
	public String postSignup(Model model, @ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult) {
		
		//入力チェック
		if (bindingResult.hasErrors()) {
			return getSignup(model, form);
		}
		
		log.info(form.toString());
		
		//Usersクラスに変換
		Users user = modelMapper.map(form, Users.class);
		
		userService.signup(user);
		
		//login画面にレダイレクト
		return "redirect:/login";
	}

}
