package com.example.springSleuthExample.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springSleuthExample.model.APIResponse;
import com.example.springSleuthExample.model.User;

@FeignClient(url = "localhost:8081",name="sample")
public interface SampleClient {
	@GetMapping("v2/user/{id}")
	public ResponseEntity<APIResponse<User>> getUser(@PathVariable("id") String id);
}
