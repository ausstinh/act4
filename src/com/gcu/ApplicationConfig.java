/*package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.gcu.business.OrderBusinessInterface;
import com.gcu.business.OrderBusinessService;
import com.gcu.controller.UserController;

@Configuration
public class ApplicationConfig {
	
	@Bean(name = "userController")
	public UserController getUserController() {
		
		return new UserController();
		
	}
	
	@Bean(name = "orderService", initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "singleton", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrderBusinessInterface getOrdersService() {
		
		return new OrderBusinessService();
		
	}
	
	
}
*/