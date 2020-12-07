package com.xworkz.constructor.dec1;

public class AquariumTester {
public static void main(String[] args) {
	Aquarium fish=new Aquarium();
	System.out.println(fish.numberOfFishes);
	System.out.println(fish.shape);
	System.out.println(fish.size);
	
	Aquarium fish1=new Aquarium(2);
	System.out.println(fish1.numberOfFishes);
	
	Aquarium fish2=new Aquarium("round");
	System.out.println(fish2.shape);
	
	Aquarium fish3=new Aquarium("round","small");
	System.out.println(fish3.shape);
	System.out.println(fish3.size);
	
	Aquarium fish4=new Aquarium("square","large");
	System.out.println(fish4.shape);
	System.out.println(fish4.size);
}
}