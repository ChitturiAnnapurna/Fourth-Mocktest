package com.training.spring.boot.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.training.spring.boot.mongodb.domain.Users;
import com.training.spring.boot.mongodb.repository.UsersRepository;

@Service
public class UserService {
	
	
	
	@Autowired
	public UsersRepository repository;
	
	
	public List<Users>fetchAllUsers() {
		return repository.findAll();
	}


	public String addUser(Users users) {
		List<Users> user = null;
		// TODO Auto-generated method stub
		user.add(users);
		return "details added successfully";
	}

	
	
	


}
