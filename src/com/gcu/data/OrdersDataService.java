package com.gcu.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.gcu.model.Order;

public class OrdersDataService implements DataAccessInterface<Order> {
	
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Autowired
	DataAccessInterface dao;

	@Override
	public List<Order> findAll() {
		 String sql = "SELECT * FROM testapp.orders";
		 List<Order> orders = new ArrayList<Order>();
		 try {
			 SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			 while(srs.next()) {
				 orders.add(new Order(
						 srs.getString("ORDER_NO"), 
						 srs.getString("PRODUCT_NAME"), 
						 srs.getFloat("PRICE"), 
						 srs.getInt("QUANTITY")));
			 }
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		return orders;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Order order) {
		String sql = "INSERT INTO orders(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?,?,?,?)";
		try {
			int rows = jdbcTemplateObject.update(sql,
					order.getOrderNo(),
					order.getProductName(),
					order.getPrice(),
					order.getQuantity());
			return rows == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Order t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Order t) {
		// TODO Auto-generated method stub
		return false;
	}

}
