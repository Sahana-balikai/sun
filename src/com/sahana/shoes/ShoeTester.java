package com.sahana.shoes;
import com.sahana.shoes.brand.Brand;
import com.sahana.shoes.brand.Shoes;

public class ShoeTester {
public static void main(String[] args) {
		
		Brand brand=new Brand();
		brand.setBrand("puma");
		brand.setSize(7);
		brand.type();
		
		System.out.println(brand.getBrand());
		System.out.println(brand.getSize());
		System.out.println(brand.getPrice());
		
		
		Shoes shoes=new Shoes();
		shoes.setBrand("Addidas");
		shoes.setSize(6);
		shoes.type();
		
		
		System.out.println(shoes.getBrand());
		System.out.println(shoes.getSize());
		System.out.println(shoes.getPrice());
		

	}

}
