package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;

public class EEEngineer extends Engineer {
	public Branch branch=Branch.EEE;
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in EEEnginner");
		System.out.println("problem solved by " + this.branch);

	}
	
	public void electricWork() {
		System.out.println("invoked electric work in EE");
	}
	
	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}

}
