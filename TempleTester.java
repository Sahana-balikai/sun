package com.xworkz.constructor;
import com.xworkz.constructor.init.Temple;

public class TempleTester {

	public static void main(String[] args) {
		Temple temple;
		temple=new Temple("Ganesha", "Edagunji", 6.00f, "laadu", 10.00f);
		String name=temple.getName();
		String place=temple.getLocation();
		//float startTime=temple.getOpenTime();
		String prasad=temple.getPrasada();
		//float close=temple.getCloseTime();
		
		
		System.out.println(name);
		System.out.println(place);
		//System.out.println(startTime);
		System.out.println(prasad);
		//System.out.println(close);
		prasad="puliyogare";
        temple.setPrasada(prasad);
		//System.out.println("updated prasada "+prasad);

	}

}
