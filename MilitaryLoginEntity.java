package com.xworkz.military.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="military_user_table")
@Transactional
@NamedQueries({
	@NamedQuery(name = "fetchPersonalByEmailIdAndPassword", query = "SELECT temp FROM MilitaryLoginEntity temp WHERE Email=:email AND Password=:password"),
})

public class MilitaryLoginEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public MilitaryLoginEntity() {
		System.out.println("Created /t"+this.getClass().getSimpleName());
	}
	
	@javax.persistence.Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="Id")
	private int Id;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
	@Column(name="Phone_No")
	private int PhoneNo;

	
	
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
