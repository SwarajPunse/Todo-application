package com.swaraj.Todouser.service;

import java.util.List;

import com.swaraj.Todouser.entities.User;
import com.swaraj.Todouser.requestDTO.UserRequestDTO;

public interface UserService {

	
	//user operations
	
	//create
	User saveUser(User user);
	
	//get user
	User getUser(String userid);
	
	//get all user
	List<User> getAllUsers();
	
	//delete user
	User deleteUser(String userid);
	
	//update user
	User updateUser(UserRequestDTO userDTO, User user);
	
}
