public class CancerTester
{
	public static void main(String[] disease)
	{
		System.out.println("JVM invokes main");
		String cancer="Deadly Disease";
		Cancer.type(cancer);
		Cancer.type(10000000);
		Cancer.type(10,10);
		
		System.out.println("exit from main");
	}
}