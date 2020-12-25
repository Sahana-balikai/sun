package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;

public class ECEngineer extends Engineer{
	public Branch branch=Branch.EC;
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ECEnginner");
		System.out.println("problem solved by " + this.branch);

	}
	
	public void circuitConnection() {
		System.out.println("invoked circuit connection in EC");
	}
	
	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}

}
