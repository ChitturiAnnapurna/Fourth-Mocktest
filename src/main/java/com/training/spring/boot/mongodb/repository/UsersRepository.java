package com.training.spring.boot.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.spring.boot.mongodb.domain.Users;

public interface UsersRepository extends MongoRepository<Users, String>{

	List<Users> findByEmail(String email);
	
	

}
