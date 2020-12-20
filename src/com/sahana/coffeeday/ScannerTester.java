package com.sahana.coffeeday;

public class ScannerTester {
	public static void main(String[] args) {

		String virus = "Corona";
		// s -static
		// f=final
		int sizeOfCharArray = virus.length();
		System.out.println("size of array: "+sizeOfCharArray);
		char c = virus.charAt(3);
		System.out.println("character at index 3: "+c);

		char[] chars = virus.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		virus = "Novel" + virus;
		System.out.println(virus);
	}

}
