package com.tka.Service;

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

}
