package com.sahana.cosmetic.dto;

import com.sahana.cosmetic.constants.CosmeticShades;
import com.sahana.cosmetic.constants.CosmeticType;

public class CosmeticDTO {
	private String brand;
	private CosmeticShades shades;
	private CosmeticType type;
	private double price;
	private int quantity;

	public CosmeticDTO() {
		// TODO Auto-generated constructor stub
	}

	public CosmeticDTO(String brand, CosmeticShades shades, CosmeticType type, double price, int quantity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price2) {
		this.price = price2;
	}

	public CosmeticShades getShades() {
		return shades;
	}

	public void setShades(CosmeticShades shades) {
		this.shades = shades;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj != null) {
			if (obj instanceof CosmeticDTO) {
				CosmeticDTO dto = (CosmeticDTO) obj;
				if (dto.getBrand() != null && dto.getType()!=null && dto.getBrand().equals(this.brand) && dto.getType().equals(this.type)) {
					System.out.println("brand and type are equal");
					return true;
				} 
			}
		}
	    System.out.println("brand and type are not equal");
		return false;
	}

}
