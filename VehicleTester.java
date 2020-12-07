package com.xworkz.constructor;
import com.xworkz.constructor.init.Vehicle;
public class VehicleTester {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("2Dec2020","Bajaj",8124);
		String mfgDate=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		int no=vehicle.getChasisNo();
		System.out.println(mfgDate);
		System.out.println(company);
		System.out.println(no);
		
		String color="black";
		vehicle.setColor(color);
		
		String owner="Rahul Bajaj";
		vehicle.setOwnerName(owner);

	}

}