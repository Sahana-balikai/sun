package com.sahana.vtu.engineer;
import com.sahana.vtu.constants.Branch;
/**
 * 
 * @author sahana
 *The class Enginer , will hold info of USN and branch
 */
	public class Engineer {
		public String USN;
		public Branch branch=Branch.MECH;
		
		/**
		 * This method will print a statement and will print the default branch i.e MECH
		 */
		public void problemSolving()
		{
			System.out.println("invoked problemSolving");
			System.out.println("problem solved by"+this.branch);
		}
		
		public final void bunking()
		{
			System.out.println("enginner bunked");
		}
	

}
