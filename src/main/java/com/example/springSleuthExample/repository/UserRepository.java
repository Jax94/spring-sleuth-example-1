package com.example.springSleuthExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springSleuthExample.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findByEmpId(String id);


}
