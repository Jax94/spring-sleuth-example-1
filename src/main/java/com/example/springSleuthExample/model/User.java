package com.example.springSleuthExample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class User {

	private String name;
	private String age;
	private String empId;

}
