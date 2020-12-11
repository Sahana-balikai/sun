package com.sahana.data;
import com.sahana.data.dto.CountryDTO;

public class CountryDTOTester {
	public static void main(String[] args) {
		CountryDTO dto=new CountryDTO();
		System.out.println(dto.getName());
		CountryDTO dto2=new CountryDTO("India", "Asia");
		System.out.println(dto2.getName());
		System.out.println(dto2.getContinent());
		System.out.println("******************");
		CountryDTO dto3=new CountryDTO(12345678, "Narendr Modi", "Ram Nath Kovind");
		System.out.println(dto3.getPopulation());
		System.out.println(dto3.getPrimeMinister());
		System.out.println(dto3.getPresident());
		System.out.println("******************");
		CountryDTO dto4=new CountryDTO("America");
		System.out.println(dto4.getName());
		System.out.println("******************");
		String[] states=new String[3];
		states[0]="Karnataka";
		states[1]="Punjab";
		states[2]="West Bengal";
		
		String[] language=new String[2];
		language[0]="kannada";
		language[1]="Hindhi";
		language[2]="English";
		CountryDTO dto5=new CountryDTO("Karnataka", "Kannada");
		
		CountryDTO countryDto4 = new CountryDTO();
		countryDto4.setStates(new String[] { "Jammu&Kashmir", "New Delhi", "Rajastan", "Gujarat", "Orissa", "MP",
				"Assam", "west Bengal", "Goa", "Maharastra", "Arunachal Pradesh", "Jharkand", "Karnataka", "AP", "TN",
				"Kerala", "Jharkand", "Bihar" });
		
		
		
		
		
	
	}
	

}
