package com.sahana.car.manager;

public class ManagerDTO {
	private String name;
	private long ContactNo;
	public ManagerDTO(String name, long contactNo)
	{
		this.name = name;
		this.ContactNo = ContactNo;
	}
	
	public ManagerDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}

}
