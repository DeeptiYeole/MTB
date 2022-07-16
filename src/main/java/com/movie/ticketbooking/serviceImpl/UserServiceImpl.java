package com.movie.ticketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticketbooking.model.Users;
import com.movie.ticketbooking.repo.UserRepo;
import com.movie.ticketbooking.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	  @Autowired 
	  UserRepo userRepo;
	  
	  public List<Users> getUsers(){
		  return userRepo.findAll();
		  }
	  
	  public Users addUser(Users user) {
		  userRepo.save(user);
		  return user;
		  
	  }
	  
	  public Users signInUser(Users user) {
		  userRepo.save(user);
		  return user;
		  
	  }
	  
	  public Users signOutUser(Users user) {
		  userRepo.delete(user);
		  return user;
	  }

}
