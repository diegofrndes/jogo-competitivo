package com.jogocompetitivo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogocompetitivo.domain.User;
import com.jogocompetitivo.dtos.UserDTO;
import com.jogocompetitivo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> findAllOrdered() {
		return userRepository.findAllOrdered();
	}
	
	public User createUser(UserDTO data) {
		User newUser = new User(data);
		this.saveUser(newUser);
		return newUser;
	}

	public void saveUser(User user) {
		this.userRepository.save(user);
	}
}
