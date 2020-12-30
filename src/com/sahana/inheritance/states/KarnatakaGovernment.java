package com.sahana.inheritance.states;

import com.sahana.inheritance.scheme.UnionGovernment;

public class KarnatakaGovernment extends UnionGovernment {
	public KarnatakaGovernment() {
		System.out.println("Created KarnatakaGovernment");
	}

	@Override
	public void ayushmanBharat() {
		System.out.println("invoked ayushmanBharat");

	}

}
