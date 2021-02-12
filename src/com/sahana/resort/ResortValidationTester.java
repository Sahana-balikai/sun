package com.sahana.resort;

import java.util.LinkedList;
import java.util.List;

import com.sahana.resort.dao.ResortDAO;
import com.sahana.resort.dao.ResortDAOImpl;
import com.sahana.resort.dto.ResortDTO;
import com.sahana.resort.service.ResortService;
import com.sahana.resort.service.ResortServiceImpl;

public class ResortValidationTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();
		
		ResortDAO dao=new ResortDAOImpl(list);
		ResortService resortService = new ResortServiceImpl(dao);
		
		
		ResortDTO dto=new ResortDTO("Ramanagar", "Shillandara", "KiranRaj", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setPoolExist(false);
        dto.setRating(4);
		//dao.save(dto);
		
		resortService.validateAndSave(dto);
		
		ResortDTO dto2=new ResortDTO("Dandeli", "KaliAdventure", "KiranRaj", 15);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(10);
		dto2.setOffers(false);
		dto2.setPhoneNo(7829731400l);
		dto2.setPoolExist(false);
        dto2.setRating(4);
        
        resortService.validateAndSave(dto2);
        
        resortService.validateAndUpdateLocationByName("Coorg", "KaliAdventure");
        
        resortService.validateAndUpdateLocationByNameandRating("Madikeri", "Shillandara", 4);
        
        System.out.println(resortService.validateTotalResortSize());
        
        resortService.validatAndDeleteByNameAndLocation("Shillandara", "Madikeri");
        
        System.out.println(resortService.validateTotalResortSize());
        
		

		

	}


}
