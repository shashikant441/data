package com.xworkz.military.dto;

import java.io.Serializable;

public class MilitaryLoginDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int Id;
	private String Email;
	private String Password;
	private int PhoneNo;
	
	public MilitaryLoginDTO() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}

	public final int getId() {
		return Id;
	}

	public final void setId(int id) {
		Id = id;
	}

	public final String getEmail() {
		return Email;
	}

	public final void setEmail(String email) {
		Email = email;
	}

	public final String getPassword() {
		return Password;
	}

	public final void setPassword(String password) {
		Password = password;
	}

	public final int getPhoneNo() {
		return PhoneNo;
	}

	public final void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	
}
