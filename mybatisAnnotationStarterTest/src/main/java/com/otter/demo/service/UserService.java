package com.otter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otter.demo.entity.UserEntity;
import com.otter.demo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public List<UserEntity> findAllUsers(){
		return userMapper.getAll();
	}
}
