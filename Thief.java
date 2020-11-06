public class Thief{



public static void steal()
{
	System.out.println("invoked steal");
	
	double pocket=Reliance.getBudget();
	System.out.println("steal budget "+pocket);
	//Reliance.budget=0; this is private now 
	System.out.println("Reliance budget "+Reliance.getBudget());
	System.out.println("EXIT :: steal");
	
}

}