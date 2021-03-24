package com.sahana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CONTACT")
public class ContactEntity {
	
	 @Id
	 @Column(name="ID")
	 @GenericGenerator(name="SAHANA",strategy="increment")
	 @GeneratedValue(generator="SAHANA")
	 private int id;
	 
	 @Column(name="USERNAME")
	 private String username;
	 
	 @Column(name="EMAIL")
	 private String email;
	 
	 @Column(name="PHONENO")
	 private String phoneNo;
	 
	
	 
	 @Column(name="TELLUSABOUTYOURPROJECT")
	 private String TellusaboutYourProject;
	 
	 public ContactEntity() {
		System.out.println("invoked default constructor");
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getTellusaboutYourProject() {
		return TellusaboutYourProject;
	}
	public void setTellusaboutYourProject(String tellusaboutYourProject) {
		TellusaboutYourProject = tellusaboutYourProject;
	}

	@Override
	public String toString() {
		return "ContactEntity [id=" + id + ", username=" + username + ", email=" + email + ", phoneNo=" + phoneNo
				+ ",  TellusaboutYourProject=" + TellusaboutYourProject + "]";
	}
	
	
	 
	 

}
