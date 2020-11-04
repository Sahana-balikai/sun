public class Nation
{
	public static void main(String[] country)
	{
		System.out.println("JVM invokes main");
		
		System.out.println("size of names: "+country.length);
				
		for(int print=0;print<country.length;print++)
		{
		System.out.println("The country name at index "+print + " is :"+ country[print]);
		
		}
	}
}