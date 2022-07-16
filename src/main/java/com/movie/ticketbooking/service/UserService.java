package com.movie.ticketbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.ticketbooking.model.Users;

@Service
public interface UserService {

	List<Users> getUsers();

	Users addUser(Users user);

	Users signInUser(Users user);

	Users signOutUser(Users user);

}
