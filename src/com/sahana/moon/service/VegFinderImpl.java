package com.sahana.moon.service;

import com.sahana.moon.dto.MoonDTO;
import com.sahana.moon.dto.MoonDTO.Type;

public class VegFinderImpl implements Finder{

	@Override
	public boolean test(MoonDTO dto) {
		if (dto != null && dto.getType().equals(Type.VEG)) {
			return true;
		}
		return false;
	
	}
	

}
