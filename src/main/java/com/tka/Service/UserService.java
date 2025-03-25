package com.tka.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.UserRepository;
import com.tka.Model.Users;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Users register(Users users) {
		return userRepository.save(users);
	}

	public Optional<Users> getallUser(String username) {
		return userRepository.findByUsername(username);
	}

//	public Users getallUser(Users users) {
//		
//		return userRepository.getalluser(users);
//	}



}
