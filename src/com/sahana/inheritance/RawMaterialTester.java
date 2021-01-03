package com.sahana.inheritance;

import com.sahana.inheritance.scheme.RawMaterial;
import com.sahana.inheritance.states.AluminiumRawMaterial;
import com.sahana.inheritance.states.CopperRawMaterial;

public class RawMaterialTester {
	public static void main(String[] args) {
		RawMaterial material=new AluminiumRawMaterial();
		material.delivery();
		material.manufacture();
		
		
		RawMaterial material2=new CopperRawMaterial();
		material2.manufacture();

	}

}
