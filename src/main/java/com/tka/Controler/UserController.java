package com.tka.Controler;
import java.net.PasswordAuthentication;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tka.Model.Users;
import com.tka.Service.UserService;
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000") 
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public Users register(@RequestBody Users users) {
		return userService.register(users);
		
	}
	@GetMapping("/{username}")
	public Optional<Users>  getUser(@PathVariable String username){
		return userService.getallUser(username);
	}
//	@GetMapping("getAllUser")
//	public Users getalluser(@RequestBody Users users ) {
//		return userService.getallUser(users);
//	}

}
