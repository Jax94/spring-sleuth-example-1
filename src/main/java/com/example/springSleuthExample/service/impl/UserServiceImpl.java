package com.AJIO.exmaple2.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.AJIO.exmaple2.clients.SampleClient;
import com.AJIO.exmaple2.domain.UserEntity;
import com.AJIO.exmaple2.model.APIResponse;
import com.AJIO.exmaple2.model.User;
import com.AJIO.exmaple2.repository.UserRepository;
import com.AJIO.exmaple2.service.UserService;

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
