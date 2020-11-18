package com.sahana.basics.Hotel;

public class Order {
	private static String[] items = { "Idli", "Upma", "Parota", "Pulav","Bajji","Rice" };

	public static void search(String product) {
		System.out.println("Total items available" + items.length);
		System.out.println("arg1 :" + product);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			String item = items[count];
			if (item.equals(product)) {
				itemFound = true;
				break;
			} else {
				itemFound = false;
			}

		}

		if (itemFound) {
			System.out.println("item is found ");
		} else {
			System.out.println("item is not found");
		}

	}

	public static int totalItems() {
		return items.length;
	}
}
