package com.gcu.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.gcu.model.User;

@Path("/service1")
public class UserService1 {

	@GET
	@Path("/users")
	@Produces("application/json")
	public List<User> getUsers(){
		
		List<User> users = new ArrayList<User>();
		users.add(new User("Michael", "Scott", 1));
		users.add(new User("James", "Bond", 1));
		
		return users;
	}
	
}
