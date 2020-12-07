package com.xworkz.constructor.init;

public class Temple {
 private String name;
 private String location;
 private float openTime;
 private String prasada;
 private float closeTime;
 
 public Temple(String name,String location,float openTime,String prasada,float closeTime) {
	 System.out.println("invoked Temple");
	 this.name=name;
	 this.location=location;
	 this.openTime=openTime;
	 this.prasada=prasada;
	 this.closeTime=closeTime;
 }

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

float getOpenTime() {
	return openTime;
}

public String getPrasada() {
	return prasada;
}

float getCloseTime() {
	return closeTime;
}

public void setPrasada(String prasada) {
	this.prasada = prasada;
	System.out.println("updated prasada is "+prasada);
}

}