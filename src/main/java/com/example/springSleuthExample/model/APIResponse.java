package com.example.springSleuthExample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class APIResponse<T> {
	int status;
	String message;
	T data;

}
