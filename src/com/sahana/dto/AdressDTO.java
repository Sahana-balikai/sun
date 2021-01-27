package com.sahana.dto;

import java.util.Date;

import com.sahana.constants.BloodGroup;
import com.sahana.constants.Gender;

public class AdressDTO extends CommonDTO{
	private String name;
	private String street;
	private int doorNo;
	private String buildingName;
	private String city;
	private String state;
	private int pincode;
	

	public AdressDTO() {
		System.out.println("invoked address dto");
	}
	public AdressDTO(String name, String street, int doorNo, String buildingName, String city, String state,
			int pincode) {
		super();
		this.name = name;
		this.street = street;
		this.doorNo = doorNo;
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public AdressDTO(String name, int age, Date dob, long mobileNo, BloodGroup bloodGroup, Gender gender) {
		super(name, age, dob, mobileNo, bloodGroup, gender);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", street=" + street + ", doorNo=" + doorNo + ", buildingName="
				+ buildingName + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	

}
