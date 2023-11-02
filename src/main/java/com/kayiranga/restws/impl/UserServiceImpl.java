package com.kayiranga.restws.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.kayiranga.restws.model.User;

import com.kayiranga.restws.repos.UserRepository;
import com.kayiranga.restws.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return  repository.findById(id).get();
	}

	@Override
	public User createUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
