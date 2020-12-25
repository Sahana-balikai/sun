package com.sahana.vtu;
import com.sahana.vtu.engineer.CSEngineer;
import com.sahana.vtu.engineer.Engineer;
import com.sahana.vtu.engineer.TCEngineer;

public class Polymorphism {
	public static void main(String[] args) {
		Engineer engineer=new CSEngineer();
		Engineer engineer1=new TCEngineer();
		
		engineer.problemSolving();
		engineer1.problemSolving();

}

}
