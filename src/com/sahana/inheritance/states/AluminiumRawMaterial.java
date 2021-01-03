package com.sahana.inheritance.states;

import com.sahana.inheritance.scheme.RawMaterial;

public class AluminiumRawMaterial extends RawMaterial{
		
		public void AluminiumRawMaterial() {
			String name=super.name;
			System.out.println("invoked AluminiumRawMaterial");
		}
		
		@Override
		public void manufacture() {
			System.out.println("invoked manufacture method");
			
		}

}
