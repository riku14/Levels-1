package com.example.repository;


import org.apache.ibatis.annotations.Mapper;

import com.example.user.model.Users;

@Mapper
public interface UserMapper {
	
	public int insertOne(Users user);
	
    /** ログインユーザー取得 */
    public Users findLoginUser(String userId);


}
