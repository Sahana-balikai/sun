package com.xworkz.constructor.dec1;

public class Season {
		public String name;
		public String startMonth;
		
		public Season() {
			System.out.println("invoked dafault");
		}
		public Season(String name,String startMonth) {
			System.out.println("invoked parameterized constructor");
			this.name=name;
			this.startMonth=startMonth;
		}

}