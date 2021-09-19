package com.training.spring.boot.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.boot.mongodb.domain.Users;
import com.training.spring.boot.mongodb.repository.UsersRepository;
import com.training.spring.boot.mongodb.service.UserService;




@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	private UserService service;
	
	
	@GetMapping(value="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers(){
		return service.fetchAllUsers();
	
	}
	
	@PostMapping(value="/addUser", produces=MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody Users users) {
		return service.addUser(users);
	}
	
}


