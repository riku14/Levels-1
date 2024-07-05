package com.example.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UserMapper;
import com.example.user.model.Users;
import com.example.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;
	
	
	@Override
	public void signup(Users user) {
		mapper.insertOne(user);

	}

}
