package com.xworkz.constructor.dec1;

public class SeasonTester {

	public static void main(String[] args) {
		Season season=new Season();
		System.out.println(season.name);
		System.out.println(season.startMonth);
		
		Season season1=new Season("Summer","April");
		System.out.println(season1.name);
		System.out.println(season1.startMonth);

	}

}