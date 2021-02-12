package com.sahana.moon.service;

import java.util.LinkedList;
import java.util.List;

import com.sahana.moon.dto.MoonDTO;
import com.sahana.moon.dto.MoonDTO.Type;

public class RestaurantServiceImpl implements RestaurantService{
	private List<MoonDTO> moons;

	public RestaurantServiceImpl() {
		this.moons = new LinkedList<MoonDTO>();
		MoonDTO menu1 = new MoonDTO("Brownie", 300, Type.NONVEG);
		MoonDTO menu2 = new MoonDTO("Sushi", 400, Type.NONVEG);
		MoonDTO menu3 = new MoonDTO("Chitranna", 30, Type.VEG);
		MoonDTO menu4 = new MoonDTO("Obattu", 15, Type.VEG);
		MoonDTO menu5 = new MoonDTO("Ghee Rice", 300, Type.VEG);

		this.moons.add(menu1);
		this.moons.add(menu2);
		this.moons.add(menu3);
		this.moons.add(menu4);
		this.moons.add(menu5);

	}

	@Override
	public void displayItemGreaterThan(double price) {
		for (MoonDTO menuDTO : moons) {
			if (menuDTO.getPrice() >= price) {
				System.out.println(menuDTO);
			}
		}

	}

	@Override
	public void displayByName(String name) {
		for (MoonDTO menuDTO : moons) {
			if (menuDTO.getItemName().equals(name)) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void findAndDisplay(Finder finder) {
		for (MoonDTO menuDTO : moons) {
			if (finder.test(menuDTO)) {
				System.out.println(menuDTO);
			}
		}

	}

}
