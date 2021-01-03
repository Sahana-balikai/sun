package com.sahana.inheritance.states;

import com.sahana.inheritance.scheme.RawMaterial;

public class CopperRawMaterial extends RawMaterial {
	public void CopperRawMaterial() {
		System.out.println("raw material invoked");
	}
	
	
	@Override
	public void manufacture() {
		System.out.println("manufacture method by copper");
		
	}

	

}
