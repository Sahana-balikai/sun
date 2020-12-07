package com.xworkz.constructor.init;

public class Paper {
	private String brand="ClassMate";
	public String color;
	String width;
	String height;
	
	public Paper(String color,String width,String height) {
		this.color=color;
		this.width=width;
		this.height=height;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getWidth() {
		return width;
	}

	public String getHeight() {
		return height;
	}

}
