package com.movie.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticketbooking.model.Users;
import com.movie.ticketbooking.service.UserService;

@RestController
public class UserLoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<Users> getUser() {
		return userService.getUsers();
	}

	@PostMapping("/users")
	public String addUsers(@RequestBody Users user) {
		userService.addUser(user);
		return "User Added";
	}

//	@PostMapping("/users")
//	public String signIn(@RequestBody Users user) {
//		userService.signInUser(user);
//		return "User Signed In";
//	}

//	@DeleteMapping("/users")
//	public String signOut(@RequestBody Users user) {
//		userService.signOutUser(user);
//		return "User Signed Out";
//	}
}
