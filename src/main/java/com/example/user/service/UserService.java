package com.example.user.service;


import com.example.user.model.Users;


public interface UserService {
	
	public void signup(Users user);
	
	public Users getLoginUser(String userId) ;
	
}
