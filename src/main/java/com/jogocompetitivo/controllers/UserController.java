package com.jogocompetitivo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jogocompetitivo.domain.User;
import com.jogocompetitivo.dtos.UserDTO;
import com.jogocompetitivo.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUser(UserDTO user){
		User newUser = userService.createUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsersOrdered(){
		List<User> users = this.userService.findAllOrdered();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
