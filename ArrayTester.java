package com.sahana.methods;
import java.util.Arrays;
public class ArrayTester {
public static void main(String[] args) {

		
		//data-type[] varName
		String[] areaNames= {"Rajajinagar","BTM","MG Road","Infantry road"};
		int size=areaNames.length;
		System.out.println(size);
		
		
		
		String[] countryNames= {"India","Srilanka","Russia"};
		System.out.println(countryNames.length);
		//arryas have fixed size
		String countryAtZeroIndex=countryNames[0];
		System.out.println(countryAtZeroIndex);
		countryNames[0]="SriLanka";
		System.out.println(countryNames[0]);
		System.out.println(Arrays.toString(countryNames));
		//countryNames[4]="Pakisthan";	
		
		String[] states=new String[50];
		System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		System.out.println(states[3]);
		states[2]="Delhi";
		states[49]="Manipur";
		System.out.println(Arrays.toString(states));
		
		
		int[] doorNumbers=new int[4];
		System.out.println(Arrays.toString(doorNumbers));
		
		
		
		
		
		
		
		
		
	}

}
