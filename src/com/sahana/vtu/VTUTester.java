package com.sahana.vtu;
import com.sahana.vtu.constants.Branch;
import com.sahana.vtu.engineer.Engineer;
import com.sahana.vtu.engineer.ISEngineer;
import com.sahana.vtu.engineer.CSEngineer;
import com.sahana.vtu.engineer.ECEngineer;
import com.sahana.vtu.engineer.EEEngineer;
import com.sahana.vtu.engineer.TCEngineer;

public class VTUTester {
public static void main(String[] args) {
	/**
	 * creating object for engineer class
	 */

		
		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();
		/**
		 * creating object for CSEngineer and retieving methods with reference
		 */

		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println(csEngineer.getParentBranch());
		csEngineer.problemSolving();

		Engineer engineer2 = new CSEngineer();
		System.out.println(engineer2.branch);
		CSEngineer csEngineer2 = (CSEngineer) engineer2;
		System.out.println(csEngineer2.branch);
		engineer2.problemSolving();
		csEngineer2.problemSolving();
		/**
		 * creating object for TCEngineer and retrieving its methods
		 */
		
		TCEngineer tcEngineer = new TCEngineer();
		System.out.println(tcEngineer.branch);
		tcEngineer.problemSolving();
		System.out.println(tcEngineer.branch);
	//	tcEngineer.branch = Branch.BIOTECH;
		System.out.println(tcEngineer.branch);
		/**
		 * creating object for ECEngineer and retrieving its methods
		 */
		
		
		ECEngineer engineer3=new ECEngineer();
		engineer3.problemSolving();
		System.out.println(engineer3.getParentBranch());
		System.out.println(engineer3.getBranch());
		engineer3.circuitConnection();
		
		/**
		 * creating object for EEEngineer and retrieving its methods
		 */
		
		EEEngineer eeengineer=new EEEngineer();
		eeengineer.problemSolving();
		System.out.println(eeengineer.getParentBranch());
		System.out.println(eeengineer.getBranch());
		eeengineer.electricWork();
		
		/**
		 * creating object for ISEngineer and retrieving its methods
		 */
		
		ISEngineer isengineer=new ISEngineer();
		isengineer.problemSolving();
		System.out.println(isengineer.getParentBranch());
		System.out.println(isengineer.getBranch());
		isengineer.gatherInfo();

	}

}
