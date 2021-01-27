package com.sahana.dto;

import java.util.Date;

import com.sahana.constants.BloodGroup;
import com.sahana.constants.Gender;

public class CommonDTO {
	private String name;
	private int age;
	private Date dob;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;
	private AdressDTO addressDTO;
	
	public CommonDTO() {
		System.out.println("invoked common dto constructor");
	}

	public CommonDTO(String name, int age, Date dob, long mobileNo, BloodGroup bloodGroup, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}	
	
	@Override
	public String toString() {
		return "CommonDTO [name=" + name + ", age=" + age + ", dob=" + dob + ", mobileNo=" + mobileNo + ", bloodGroup="
				+ bloodGroup + ", gender=" + gender + ", addressDTO=" + addressDTO + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

}
