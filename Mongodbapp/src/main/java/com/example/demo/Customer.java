package com.example.demo;
import org.springframework.data.annotation.*;
public class Customer {

	@Id
	public String id;
	public String fisrtName;
	public String LastName;
	
	public Customer() {
		
		
	}
	public Customer(String id, String fisrtName, String lastName) {
		
		id = id;
		this.fisrtName = fisrtName;
		LastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + id + ", fisrtName=" + fisrtName + ", LastName=" + LastName + "]";
	}
	
}
