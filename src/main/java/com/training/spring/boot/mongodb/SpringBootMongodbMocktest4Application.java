package com.training.spring.boot.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.boot.mongodb.domain.Users;
import com.training.spring.boot.mongodb.repository.UsersRepository;

@SpringBootApplication
public class SpringBootMongodbMocktest4Application {
	
	@Autowired
	private UsersRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbMocktest4Application.class, args);
	}
	

}
