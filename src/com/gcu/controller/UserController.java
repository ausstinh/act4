package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.business.OrderBusinessInterface;
import com.gcu.model.Order;
import com.gcu.model.User;

@Controller
@RequestMapping("/user")
public class UserController 
{
	OrderBusinessInterface service;
	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	public ModelAndView displayForm()
	{
		return new ModelAndView("addUser", "user", new User("", "", 0));
	}
	
	@RequestMapping(path="/adduser", method=RequestMethod.POST)
	public ModelAndView addUser(@Valid @ModelAttribute("user")User user, BindingResult results)
	{
		if(results.hasErrors())
		{
			return new ModelAndView("addUser", "user", user);
		}
		
		//service.test();
		List<Order> orders = service.getAllOrders();
		
		return new ModelAndView("displayOrders", "orders", orders);
		
		/*List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(new User("Eiten","Mimini", 1));
		users.add(new User("Ioanna", "Zega", 2));*/
		//return new ModelAndView("displayUsers", "users", users);
	}
	
	@Autowired
	public void setOrderService(OrderBusinessInterface service) {
		this.service = service;
	}
	
	
}
