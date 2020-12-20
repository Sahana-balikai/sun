package com.sahana.coffeeday;
import com.sahana.coffeeday.appliances.Power;

public class EqualityTester {
	public static void main(String[] args) {

		Power power=new Power();
		
		Power power2=new Power();
		
		if(power==power2) {
			System.out.println("power pointing to same instance");
		} else {
			System.out.println("power is not pointing to same instance");
		}
		
		boolean value=power.equals(power2);
		System.out.println(value);
	}

}
