package com.example.springSleuthExample.service;

import com.example.springSleuthExample.model.User;

public interface UserService {
	
	User addUser(User user);

	User getUser(String id);

}
