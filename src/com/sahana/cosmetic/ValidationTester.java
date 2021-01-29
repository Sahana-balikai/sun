package com.sahana.cosmetic;

import com.sahana.cosmetic.constants.CosmeticShades;
import com.sahana.cosmetic.constants.CosmeticType;
import com.sahana.cosmetic.dao.CosmeticDAO;
import com.sahana.cosmetic.dao.CosmeticDAOImpl;
import com.sahana.cosmetic.dto.CosmeticDTO;
import com.sahana.cosmetic.service.CustomerService;
import com.sahana.cosmetic.service.CustomerServiceImpl;

public class ValidationTester {
	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(2);
		cosmeticDTO.setShades(CosmeticShades.PINK);
		cosmeticDTO.setType(CosmeticType.LIPSTIC);
		
		
		CosmeticDAO dao=new CosmeticDAOImpl();
		dao.save(cosmeticDTO);
		
		CustomerService service=new CustomerServiceImpl(dao);
		service.validateAndSave(cosmeticDTO);
		
		
		CosmeticDTO dto=new CosmeticDTO("Sugr", CosmeticShades.PLUM, CosmeticType.FOUNDATION, 1000, 2);
		service.validateAndSave(dto);
		System.out.println(service.size());
		
		service.deleteByBrand("Sugr");
		
		System.out.println(service.size());
		
		

	}

}
