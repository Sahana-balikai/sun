public class IPhoneTester{


    public static void main(String[] models)
	{
		System.out.println("JVM invoked main ");		
		  IPhone.call();
		  System.out.println("return value from call");
		  
		  String sandesha=IPhone.message();
		  System.out.println("return value from message() "+ sandesha);
		  
             
		System.out.println("EXIT:: main");
		
	}

}
