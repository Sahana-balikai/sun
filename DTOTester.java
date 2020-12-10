package com.sahana.data;
import com.sahana.data.transfer.CustomerDTO;

public class DTOTester {
	public static void main(String[] args) {
		CustomerDTO customerDto=new CustomerDTO();
		customerDto.setCustomerId(2113);
		System.out.println(customerDto.getCustomerId());
		customerDto.setName("Sahana");
		System.out.println(customerDto.getName());
		customerDto.setContactNo(8105290224l);
		System.out.println(customerDto.getContactNo());
		customerDto.setEmail("sahanabalikai@gmail.com");
		System.out.println(customerDto.getEmail());
		
		
		
		CustomerDTO customerDto2=new CustomerDTO();
		customerDto2.setCustomerId(5434);
		System.out.println(customerDto2.getCustomerId());
		customerDto2.setName("Sapna");
		System.out.println(customerDto2.getName());
		customerDto2.setContactNo(7676569849l);
		System.out.println(customerDto2.getContactNo());
		customerDto2.setEmail("sapnabalikai@gmail.com");
		System.out.println(customerDto2.getEmail());
		

	}

}
