package com.sahana.coffeeday.appliances;

public class Power {
	private int voltage = 0;

	public Power() {
		System.out.println("init Power");
	}

	public boolean generatePower() 
	{
		this.voltage = 200;
		return true;
	}

}
