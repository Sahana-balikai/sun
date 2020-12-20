package com.sahana.coffeeday;

public class StringEquality {
	public static void main(String[] args) {

		String gadget="X-box";
		String gamingSystem="X-box";
		String device="X-box";
		if(gadget==gamingSystem && gadget==device) {
			System.out.println("both ref pointing to same obj");
		} else {
			System.out.println("both ref pointing to different obj");
		}
		
		boolean value=gadget.equals(gamingSystem);
		System.out.println(value);
		
		boolean empty=gadget.isEmpty();
		System.out.println(empty);
		
		System.out.println(device);
		
		String upperDevice=device.toUpperCase();
		System.out.println(upperDevice);
		
		device=device.toLowerCase();
		System.out.println(device);
		
		//concatenation
		String concat=device+"Gaming";
		System.out.println(concat);
		
		String concatUsingMethod=device.concat("Virtual");
		System.out.println(concatUsingMethod);
		System.out.println(device.concat("Super"));
		
		//other 8 methods
		String space=gadget.replace("-", " ");
		System.out.println(space);
		
		int index=device.indexOf("b");
		System.out.println(index);
		
		boolean find=space.contains(" ");
		System.out.println(find);
		
		boolean ending=device.endsWith(concatUsingMethod);
		System.out.println(ending);
		
		String replace=gadget.replaceAll("box", "workz");
		System.out.println(replace);
		
		int indexCount=concatUsingMethod.codePointCount(3, 7);
		System.out.println(indexCount);
		
		String sub=space.substring(1);
		System.out.println(sub);
		
		String subString=space.substring(0, 3);
		System.out.println(subString);
	}

}
