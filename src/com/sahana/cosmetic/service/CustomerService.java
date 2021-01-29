package com.sahana.cosmetic.service;

import com.sahana.cosmetic.dto.CosmeticDTO;

public interface CustomerService {
boolean validateAndSave(CosmeticDTO cosmeticDTO);
	
	void deleteByBrand(String brand);
	
	int size();

}
