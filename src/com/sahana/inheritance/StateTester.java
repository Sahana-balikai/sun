package com.sahana.inheritance;

import com.sahana.inheritance.scheme.UnionGovernment;
import com.sahana.inheritance.states.KarnatakaGovernment;

public class StateTester {
	public static void main(String[] args) {

		UnionGovernment government=new KarnatakaGovernment() ;
		government.atalPensionYogana();
		
		
		Number number=new Integer(56);
		number =new Double(78);
	}

}
