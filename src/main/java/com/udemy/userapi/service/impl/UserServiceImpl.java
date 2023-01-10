package com.udemy.userapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.userapi.domain.User;
import com.udemy.userapi.repository.UserRepository;
import com.udemy.userapi.service.UserService;
import com.udemy.userapi.service.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Object not found"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
