package com.udemy.userapi.service;

import java.util.List;

import com.udemy.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	List<User> findAll();

}
