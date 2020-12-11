package com.sahana.data.dto;

public class MobileDTO {
	private String name;
    private String color;
    private int batteryCapacity;
    private String storage;
    private int price;
    
    public MobileDTO(String name) {
   	 this.name=name;
    }
    public MobileDTO(String color,String Storage,int batteryCapacity,int price) {
   	 this.color=color;
   	 this.storage=storage;
   	 this.batteryCapacity=batteryCapacity;
   	 this.price=price;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
