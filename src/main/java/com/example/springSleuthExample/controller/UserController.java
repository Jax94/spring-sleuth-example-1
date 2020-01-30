package com.example.springSleuthExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSleuthExample.model.APIResponse;
import com.example.springSleuthExample.model.User;
import com.example.springSleuthExample.service.UserService;

import lombok.extern.java.Log;

@RestController
@Log
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("v1/user/{id}")
	public ResponseEntity<APIResponse<User>> getUser(@RequestHeader HttpHeaders headers,@PathVariable("id") String id){
		APIResponse<User> response = new APIResponse<>();
		User user;
		try {
			log.info("call came to example2 with headers : " + headers.toString());
			
			 user = service.getUser(id);
		}
		catch (Exception e) {
			response.setMessage("Failed Fetching data");
			response.setStatus(1);
			return new ResponseEntity<APIResponse<User>>(response,  HttpStatus.BAD_REQUEST);
 }
		response.setData(user);
		response.setMessage("Succesfully Fetched data");
		response.setStatus(0);
		return new ResponseEntity<APIResponse<User>>(response,  HttpStatus.OK);
		
	}
	
	
	@PostMapping("v1/user")
	public ResponseEntity<APIResponse<User>> addUser(@RequestBody User user){
		APIResponse<User> response = new APIResponse<>();
		User user2;
		try {
			 user2 = service.addUser(user);
		}
		catch (Exception e) {
			response.setMessage("Failed to add data");
			response.setStatus(1);
			return new ResponseEntity<APIResponse<User>>(response,  HttpStatus.BAD_REQUEST);
 }
		response.setData(user2);
		response.setMessage("Succesfully Added data");
		response.setStatus(0);
		return new ResponseEntity<APIResponse<User>>(response,  HttpStatus.OK);
		
	}
	

}
