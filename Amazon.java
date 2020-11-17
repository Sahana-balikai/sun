package com.sahana.basics;

public class Amazon {
	private static String[] items = { "Mobile", "Watch", "Shoes", "Dress", "Books", "Grociers", "Bedding set",
			"Kitchen Applicanes", "Cosmetics", "Jewelleries", "headphones", "Electronic items", "Furniture",
			"Suitcsaes", "Bag packs", "Sun Glasses", "Gift cards", "Laptop", "Home decor's" };

	public static void search(String product) {
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + items.length);
		System.out.println("arg1 :" + product);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			//System.out.println("item at position " + items[count]);
			String item = items[count];
			if (item.equals(product)) {
				// System.out.println("item is found");
				itemFound = true;
				break;
			} else {
				// System.out.println("item is not found");
				itemFound = false;
			}

		}

		if (itemFound) {
			System.out.println("item is found ");
		} else {
			System.out.println("item is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalItems() {
		return items.length;
	}
}
