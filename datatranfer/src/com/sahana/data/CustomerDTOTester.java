package com.sahana.data;
import com.sahana.data.dto.CustomerDTO;

public class CustomerDTOTester {
	public static void main(String[] args) {

		// f6 --to execute step
		// f8 to come out of execution
		CustomerDTO customerDTO = new CustomerDTO();
		// customerDTO.setCustomerId(7581);
		customerDTO.setName("Sahana");
		customerDTO.setContactNo(8105290224l);
		customerDTO.setEmail("sahana.balikai@gmail.com");

		if (customerDTO.getContactNo() > 0) {
			System.out.println(customerDTO.getContactNo());
		} else {
			System.out.println("contact no is not  there");
		}
		//System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getCustomerId());
		
		CustomerDTO customerDTO2=new CustomerDTO();
		customerDTO2.setName("Mala");
		customerDTO2.setCustomerId(7582);
		customerDTO2.setEmail("mala.xworkz@gmail.com");
		customerDTO2.setContactNo(7829446971l);
		
	}

}
