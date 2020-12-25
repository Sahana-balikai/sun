package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;

public class CSEngineer extends Engineer{
	public Branch branch = Branch.CS;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in CSEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public  void coding() {
		System.out.println("invoked coding in CS");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}
	

}
