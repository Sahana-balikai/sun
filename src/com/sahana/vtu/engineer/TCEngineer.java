package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;

public class TCEngineer extends Engineer{
	public Branch branch = Branch.TC;
	public final Branch branchE=Branch.EEE;

	public void problemSolving() {
		System.out.println("Problem solved by TC engineer");
		System.out.println(this.branch);
	}
	

}
