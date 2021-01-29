package com.sahana.cosmetic;



import java.util.List;

import com.sahana.cosmetic.constants.CosmeticShades;
import com.sahana.cosmetic.constants.CosmeticType;
import com.sahana.cosmetic.dao.CosmeticDAO;
import com.sahana.cosmetic.dao.CosmeticDAOImpl;
import com.sahana.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {
	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(CosmeticShades.PINK);
		cosmeticDTO.setType(CosmeticType.EYELINER);

		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(cosmeticDTO);

		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Lakme", CosmeticShades.PLUM, CosmeticType.LIPSTIC, 50, 2);
		dao.save(cosmeticDTO2);

		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lakme", CosmeticShades.PLUM, CosmeticType.LIPSTIC, 50, 2);
		dao.save(cosmeticDTO3);

		CosmeticDTO cosmeticDTO4 = new CosmeticDTO("Eyetex", CosmeticShades.PINK, CosmeticType.MASCARA, 70, 3);
		dao.save(cosmeticDTO4);

		dao.updatePriceAndQuantityByBrand(500, 70, "may");

		dao.updatePriceByBrandAndType(700, "Maybelline", CosmeticType.FOUNDATION);
		//dao.getAll();
         List<CosmeticDTO> dtos=dao.getAll();
         System.out.println("getting all elements "+dtos);
         
		dao.totalSize();

		dao.deleteByBrand("Maybelline");

		dao.deleteAll();

		dao.updatePriceByBrandAndType(700, "Maybelline", CosmeticType.FOUNDATION);

	}

}
