public class TableTester{


public static void main(String[] somethings)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+somethings.length);	
        
		String book="Comic";
		Table.holding(book);

		Table.holding(book,6);
		
		Table.holding(book,"spoon");


	System.out.println("EXIT :: main");	
}

}