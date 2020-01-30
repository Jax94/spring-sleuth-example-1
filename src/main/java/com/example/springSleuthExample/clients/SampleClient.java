package com.AJIO.exmaple2.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.AJIO.exmaple2.model.APIResponse;
import com.AJIO.exmaple2.model.User;

@FeignClient(url = "localhost:8081",name="sample")
public interface SampleClient {
	@GetMapping("v2/user/{id}")
	public ResponseEntity<APIResponse<User>> getUser(@PathVariable("id") String id);
}
