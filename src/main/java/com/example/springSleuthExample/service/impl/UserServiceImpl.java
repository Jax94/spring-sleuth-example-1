package com.example.springSleuthExample.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springSleuthExample.clients.SampleClient;
import com.example.springSleuthExample.domain.UserEntity;
import com.example.springSleuthExample.model.APIResponse;
import com.example.springSleuthExample.model.User;
import com.example.springSleuthExample.repository.UserRepository;
import com.example.springSleuthExample.service.UserService;

import lombok.extern.java.Log;
@Service
@Log
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	SampleClient client;

	@Override
	public User addUser(User user) {
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);
		repo.save(entity);
		return user;
	}

	@Override
	public User getUser(String id) {
		
		log.info("calling example3");
	ResponseEntity<APIResponse<User>> user = client.getUser(id);
		return user.getBody().getData();
	}

}
