package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;

public class ISEngineer extends Engineer {
	public Branch branch=Branch.IS;
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ISEnginner");
		System.out.println("problem solved by " + this.branch);

	}
	
	public void gatherInfo() {
		System.out.println("invoked gather info in IS ");
	}
	
	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}

}
