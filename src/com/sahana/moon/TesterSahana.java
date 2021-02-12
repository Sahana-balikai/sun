package com.sahana.moon;

import java.util.Collections;

import com.sahana.moon.dto.MoonDTO;
import com.sahana.moon.service.Finder;
import com.sahana.moon.service.RestaurantService;
import com.sahana.moon.service.RestaurantServiceImpl;

public class TesterSahana {
	public static void main(String[] args) {

		RestaurantService restaurantService = new RestaurantServiceImpl();

		// restaurantService.displayItemGreaterThan(200);
		/*
		 * Finder finder=new FinderImpl(); finder=new VegFinderImpl();
		 */
//Functional Interface
		restaurantService.findAndDisplay(new Finder() {
			@Override
			public boolean test(MoonDTO dto) {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}

		});
//(ref)->{};
		//() is required if you have more than one param
		//more than one statement
		restaurantService.findAndDisplay(d->d.getPrice()>300);
		
		Collections.sort(list);
	}

}
