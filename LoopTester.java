public class LoopTester{



public static void main(String[] displays)
{

System.out.println("JVM invoked main");

boolean termination=true;

for(byte start=0;termination;start++)
{
	System.out.println("infinite");
	System.out.println("Value of init variable :"+start);
	if(start==3)
	{
		termination=false;
	}
	
}


//System.out.println("EXIT ::main");
}	

}
