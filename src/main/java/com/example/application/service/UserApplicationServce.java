package com.example.application.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserApplicationServce {
	
	//性別のMap作成する
	public Map<String, Integer>  getGenderMap(){
		
		
		Map<String, Integer> genderMap = new LinkedHashMap<>();
		genderMap.put("男", 1);
		genderMap.put("女", 2);
		return genderMap;
		
	}

}
