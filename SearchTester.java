package com.sahana.basics;

public class SearchTester {
	public static void main(String[] args) {

		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + Amazon.totalItems());
		Amazon.search("Glass");

		System.out.println("main nirgamana");
	}
}
