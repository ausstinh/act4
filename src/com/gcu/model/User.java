package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User 
{
	//Data Validation Annotations
	@NotNull(message="First name cannot be null.")
	@Size(min=2, max=30, message="First name must be between 2 and 30 characters.")
	private String firstName;
	
	//Data Validation Annotations
	@NotNull(message="Last name cannot be null.")
	@Size(min=2, max=30, message="Last name must be between 2 and 30 characters.")
	private String lastName;
	
	@NotNull(message="Gender can not be empty")
	private int gender;
	
	public User(String firstName, String lastName, int gender) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public User()
	{
		this.firstName = "";
		this.lastName = "";
		this.gender = 0; 
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public int getGender() 
	{
		return gender;
	}

	public void setGender(int gender) 
	{
		this.gender = gender;
	}	
	
	public String printGender()
	{
		if(this.gender == 1)
		{
			return "Male";
		}
		
		else
		{
			return "Female";
		}
	}
}
