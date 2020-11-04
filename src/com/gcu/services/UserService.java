package com.gcu.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.User;

@RestController
@RequestMapping("/service")
public class UserService {

	@GetMapping("/users")
	public List<User> getUsers(){
		
		List<User> users = new ArrayList<User>();
		users.add(new User("Michael", "Scott", 1));
		users.add(new User("James", "Bond", 1));
		
		
		return users;
	}
	
}
