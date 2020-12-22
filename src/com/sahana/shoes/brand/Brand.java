package com.sahana.shoes.brand;

public class Brand {
	protected String brand;
	protected int size;
	protected double price=2000;
	
	public void type() {
		System.out.println("Invoked type");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
