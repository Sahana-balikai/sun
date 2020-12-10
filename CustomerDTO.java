package com.sahana.data.transfer;

public class CustomerDTO {
	private int customerId;
    private String name;
    private long contactNo;
    private String email;
    
    
    public CustomerDTO() {
  	System.out.println("invoked customerDTO");  
    }
    public long getContactNo() {
		return contactNo;
	}
    public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
    public int getCustomerId() {
		return customerId;
	}
    public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
}


