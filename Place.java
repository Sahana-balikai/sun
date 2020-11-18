package com.sahana.basics.Bus;

public class Place {
	private static String[] buses = { "Hubli", "Dharwad", "Bangalore","Mysore" };

	public static void search(String place) {
		System.out.println("Total buses available" + buses.length);
		System.out.println("place is :" + place);
		boolean placeFound = false;
		for (int count = 0; count < buses.length; count++) {
			String item = buses[count];
			if (item.equals(place)) {
				placeFound = true;
				break;
			} else {
				placeFound = false;
			}

		}

		if (placeFound) {
			System.out.println("place is found ");
		} else {
			System.out.println("Place is not found");
		}
    }
}
