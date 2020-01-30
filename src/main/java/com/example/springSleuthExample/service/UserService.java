package com.AJIO.exmaple2.service;

import com.AJIO.exmaple2.model.User;
public interface UserService {
	
	User addUser(User user);

	User getUser(String id);

}
