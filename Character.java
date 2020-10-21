public class Character{
	
	public static void main(String[] letter)
	{
		System.out.println("invoked main method by JVM");
		arrayOfCharacter();
		System.out.println("exiting main method by JVM");
	}
	
	
	
	public static void arrayOfCharacter()
	{
		 System.out.println("invoked arrayOfCharacter");
	
		 char[] arrayOfCharacter={'s', 'a', 'u', 'y', 'a', 'l', 'p', 'e', 'g', 'k'};
		 System.out.println(arrayOfCharacter.length);
	
	}
}
