package com.example.gerenciacliente.ui;

public class Client {
	private String name;
	private String address;
	private String phoneNumber;
	// Add more fields as needed

	public Client(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber= phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	// Add getters and setters for other fields
}
