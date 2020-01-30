package com.AJIO.exmaple2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AJIO.exmaple2.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findByEmpId(String id);


}
