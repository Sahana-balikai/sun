package com.sahana.data;
import com.sahana.data.dto.PlayerDTO;

public class PlayerDTOTester {
	public static void main(String[] args) {

		PlayerDTO dto = new PlayerDTO();
		dto.setName("Mary Kom");
		String countryName = "AUS";
		dto.setCountry(countryName);
		// String[] awardsList= {"Arjuna","Drona","Khel ratna"};
		String[] awardsList = new String[3];
		awardsList[0] = "Arjuna";
		awardsList[1] = "Drona";
		awardsList[2] = "Khel Ratna";

		dto.setAwards(awardsList);

		String[] sports = new String[2];
		sports[0] = "Boxing";
		sports[1] = "Karate";

		dto.setSports(sports);
		PlayerDTO dto2=new PlayerDTO();
		dto2.setCountry(countryName);
		dto2.setName("Sachin");
		dto2.setAwards(awardsList);
	}
	

}
