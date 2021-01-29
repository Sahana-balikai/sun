package com.sahana.cosmetic.dao;

import java.util.List;

import com.sahana.cosmetic.constants.CosmeticType;
import com.sahana.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {
boolean save(CosmeticDTO dto);
	
	boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);

	boolean updatePriceByBrandAndType(double price,String brand,CosmeticType type);
	
	boolean deleteByBrand(String brand);
	
	void deleteAll();
	
	List<CosmeticDTO> getAll();
	
	int totalSize();
	

}
