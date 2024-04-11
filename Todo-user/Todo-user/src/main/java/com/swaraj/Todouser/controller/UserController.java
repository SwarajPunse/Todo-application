package com.swaraj.Todouser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaraj.Todouser.entities.User;
import com.swaraj.Todouser.requestDTO.UserRequestDTO;
import com.swaraj.Todouser.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//create
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	//get single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	//all
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUsers();
		return ResponseEntity.ok(allUser);
	}
	
	
	//update
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable String userId,@RequestBody UserRequestDTO userRequestDTO){
		User user = userService.getUser(userId);
		User user1 =userService.updateUser(userRequestDTO, user);
		return ResponseEntity.ok(user1);
		
	}
	
	
	//delete
	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable String userId){
		User user = userService.deleteUser(userId);
		return ResponseEntity.ok(user);
	}
	
	
}
