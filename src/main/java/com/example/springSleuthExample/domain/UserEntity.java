package com.example.springSleuthExample.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
@Entity
public class UserEntity {
	@Id
	private String name;
	private String age;
	private String empId;
	private Long salary;

}