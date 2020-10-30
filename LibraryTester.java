public class LibraryTester
{
	public static void main(String[] knowledge)
	{
		System.out.println("JVM invokes main");
		String book="JAVA- The complete reference";
		Library.subject(book);
		Library.subject(100000);
		Library.subject(100,250);
		
		System.out.println("exit from main");
	}
}