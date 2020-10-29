public class AgeTester{


public static void main(String[] args)
{
	
	System.out.println("JVM invoked main");
	
	String ageInString=args[0];

	byte ageInByte=Byte.parseByte(ageInString); 
	Age.ageDefinition(ageInByte);
	
	
	System.out.println("EXIT :: main");
	
}

}
