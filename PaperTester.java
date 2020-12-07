package com.xworkz.constructor;
import com.xworkz.constructor.init.Paper;

public class PaperTester {

	public static void main(String[] args) {
		Paper paper=new Paper("white","10px","20px");
		String brand=paper.getBrand();
		String color=paper.getColor();
		String width=paper.getWidth();
		String height=paper.getHeight();
		
		System.out.println(brand);
		System.out.println(color);
		System.out.println(width);
		System.out.println(height);

	}

}