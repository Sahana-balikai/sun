package com.sahana.basics.Phonenumber;

public class PhoneNumbers {
	private static long[] contacts = { 7829731400l, 7975459050l, 9845474910l,9902848325l,7204672052l };

	public static void search(long number) {
		System.out.println("Total contacts available" + contacts.length);
		System.out.println("number is :" + number);
		boolean numberFound = false;
		for (int count = 0; count < contacts.length; count++) {
			long item = contacts[count];
			if (item==(number)) {
				numberFound = true;
				break;
			} else {
				numberFound = false;
			}

		}

		if (numberFound) {
			System.out.println("contact is found ");
		} else {
			System.out.println("contact is not found");
		}
    }

	public static int totalItems() {
		return contacts.length;
	}
}
