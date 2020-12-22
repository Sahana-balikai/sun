package com.sahana.bakery;
import com.sahana.bakery.browser.Browser;
import com.sahana.bakery.browser.Firefox;

public class FirefoxTester {
	public static void main(String[] args) {

		Object generic=new Firefox();
		
		Browser browser=new Firefox();
	
		Firefox firefox=new Firefox();
		
		

		//it is illegal Browser child=new Object();
		
		//instanceOf
		generic=new String("test");
		if(generic instanceof Firefox)
		{
			System.out.println("yes it is fire fox");
			Firefox fireFoxCasted=(Firefox)generic;
			System.out.println(firefox.getName());

		}
		else {
			System.out.println("it is not fire fox");
		}
		
		
		
	}

}
