package com.sahana.basics;

public class HotelMenu {
	public static void main(String[] args) {

		System.out.println("Total items to search" + Order.totalItems());
		Order.search("Idli");
	}
}
