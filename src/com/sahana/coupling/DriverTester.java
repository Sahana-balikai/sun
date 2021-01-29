package com.sahana.coupling;

public class DriverTester {

	public static void main(String[] args) {
Vehicle vehicle=new TruckVehicle();
		
		Driver driver = new Driver("Veeresh",vehicle);
		driver.drive();

	}

}
