public class MessageTester{


public static void main(String[] msgs)
{
	
	System.out.println("JVM invoked main");

	String valueAtIndex0=msgs[0];	
    int number=Integer.parseInt(valueAtIndex0);
	VTU.printMessage(number);
	
	System.out.println("***************************************");
	
	VTU.groupMessagesAndLoop();
	

	System.out.println("EXIT :: main");

	
}

}