package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.Order;

public class OrderBusinessService implements OrderBusinessInterface {

	@SuppressWarnings("rawtypes")
	@Autowired
	DataAccessInterface dao;

	
	@Override
	public void test() {
		
		System.out.println("Hello from OrderBusinesService()");

	}
	
	public void init() {
		
		System.out.println("Hello from init()");
		
	}
	
	public void destroy() {
		
		System.out.println("Hello from destroy()");
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Order> getAllOrders() {
		
		dao.create(new Order("31", "SPRING JDBC", 1.00f, 31));
			return dao.findAll();
		}
	}

