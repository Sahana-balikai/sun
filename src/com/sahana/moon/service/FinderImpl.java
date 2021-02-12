package com.sahana.moon.service;

import com.sahana.moon.dto.MoonDTO;
import com.sahana.moon.dto.MoonDTO.Type;


public class FinderImpl implements Finder{
    @override
	public boolean test(MoonDTO dto) {
		System.out.println("test method");
		if (dto != null && dto.getType().equals(Type.NONVEG)) {
			return true;
		}
		return false;
	}
	

}
