package com.sahana.celebration;

import com.sahana.celebration.service.DisplayService;
import com.sahana.celebration.service.DisplayServiceImpl;

public class Tester1 {
	public static void main(String[] args) {

		DisplayService service=new DisplayServiceImpl();
		
		service.printString((l,t)->{
			System.out.println("validating"+l + " t"+t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});
		
		
	}

}
