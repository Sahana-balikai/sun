package com.sahana.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sahana.cosmetic.constants.CosmeticType;
import com.sahana.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO{
	private List<CosmeticDTO> database;

	public CosmeticDAOImpl() {
		this.database = new ArrayList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		System.out.println("invoked save method");
		if (!this.database.contains(dto)) {
			added = this.database.add(dto);
		}
		if (added) {
			System.out.println("item added" + dto);
			return true;
		} else {
			System.out.println("item not added");
		}
		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		for (CosmeticDTO cosmeticDTO : this.database) {
			String brandFromDTO = cosmeticDTO.getBrand();
			if (brandFromDTO != null && brandFromDTO.equals(brand)) {
				System.out.println("brand found can update price and quantity");
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuantity(quantity);
				System.out.println("updated price and quantity " + cosmeticDTO);
				return true;
			} else {
				System.out.println("brand not found");
				break;
			}
		}
		System.out.println("no elements in the list");
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");
		for (CosmeticDTO cosmeticDTO : this.database) {
			String brandFromDTO = cosmeticDTO.getBrand();
			CosmeticType typeFromDTO = cosmeticDTO.getType();
			if (brandFromDTO != null && typeFromDTO != null && brandFromDTO.equals(brand) && typeFromDTO.equals(type)) {
				System.out.println("brand and type found can update price");
				cosmeticDTO.setPrice(price);
				System.out.println("updated price " + cosmeticDTO);
				return true;
			} else {
				System.out.println("brand and type not matched");
				break;
			}
		}
		System.out.println("no elements in the list");
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		Iterator<CosmeticDTO> iterator = this.database.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				System.out.println("brand found can delete brand");
				iterator.remove();
				System.out.println("cosmetic brand deleted");
				return true;
			} else {
				System.out.println("cosmetic brand not found");
			}
		}
		return false;
	}

	@Override
	public void deleteAll() {
		System.out.println("invoked deleteAll");
//		Iterator<CosmeticDTO> iterator = this.database.iterator();
//		while (iterator.hasNext()) {
//			iterator.next();
//			iterator.remove();
//			System.out.println("all elements deleted ");
//			}
		//or
		this.database.clear();
		
		}

	

	@Override
	public List<CosmeticDTO> getAll() {
//		for (CosmeticDTO cosmeticDTO : this.database) {
//			System.out.println("elements in list are "+cosmeticDTO);
//		}
		return this.database;
	}

	@Override
	public int totalSize() {
			int size=this.database.size();
			System.out.println("size of the list "+size);
		return size;
	}
	

}
