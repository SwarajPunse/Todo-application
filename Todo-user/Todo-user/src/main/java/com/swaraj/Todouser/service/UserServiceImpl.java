package com.swaraj.Todouser.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaraj.Todouser.Exception.ResourceNotFoundException;
import com.swaraj.Todouser.entities.User;
import com.swaraj.Todouser.repository.UserRepository;
import com.swaraj.Todouser.requestDTO.UserRequestDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		
		//generates unique userid
		String randomUserId = UUID.randomUUID().toString();
		user.setUserid(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public User getUser(String userid) {
		// TODO Auto-generated method stub
		return userRepository.findById(userid).orElseThrow(()-> new ResourceNotFoundException("User with given userid is not found "+ userid));
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User deleteUser(String userid) {
		User u = getUser(userid);
		userRepository.delete(u);
		return u;
	}

	@Override
	public User updateUser(UserRequestDTO userDTO, User user) {
		if(userDTO.getUsername()!= null) {
			user.setUsername(userDTO.getUsername());
		}
		if(userDTO.getEmailid()!= null) {
			user.setEmailid(userDTO.getEmailid());
		}
		if(userDTO.getAbout()!= null) {
			user.setAbout(userDTO.getAbout());
		}
		return user;
	}

}
