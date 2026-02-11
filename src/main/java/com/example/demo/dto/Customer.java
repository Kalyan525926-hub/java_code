package com.example.demo.dto;

public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String mobile;
	public String getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    // Getters & Setters
}
