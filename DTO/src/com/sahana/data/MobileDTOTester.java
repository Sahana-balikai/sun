package com.sahana.data;
import com.sahana.data.dto.MobileDTO;

public class MobileDTOTester {
	public static void main(String[] args) {
		
		MobileDTO mobileDto=new MobileDTO("Iphone");
		System.out.println(mobileDto.getName());
		mobileDto.setName("one plus");
		System.out.println(mobileDto.getName());
		
		
		MobileDTO mobileDto1=new MobileDTO("Blue", "16", 10000, 12000);
		System.out.println(mobileDto1.getColor());
		System.out.println(mobileDto1.getBatteryCapacity());
		System.out.println(mobileDto1.getStorage());
		System.out.println(mobileDto1.getPrice());

	
}

}
