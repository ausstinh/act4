package com.gcu.business;

import java.util.List;

import com.gcu.model.Order;

public class AnotherOrderBusinessService implements OrderBusinessInterface {

	@Override
	public void test() {
		
		System.out.println("Hello from anotherOrderBusinesService()");

	}

	@Override
	public void init() {
		
		System.out.println("Hello from init()");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Hello from destroy()");
		
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
