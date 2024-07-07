package com.example.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.repository.UserMapper;
import com.example.user.model.Users;
import com.example.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private PasswordEncoder encoder;
	
	
	
	@Override
	public void signup(Users user) {
		
		//passwordの暗号化
		String rawPassword = user.getPassword();
		user.setPassword(encoder.encode(rawPassword));
		
		mapper.insertOne(user);

	}
	
	
	@Override
	public Users getLoginUser(String userId) {
		return mapper.findLoginUser(userId);
	}

}
