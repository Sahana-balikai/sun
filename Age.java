public class Age
{
	
		public static String ageDefinition(byte age)
		{
		
		System.out.println("invoked ageDefinition");
		
		System.out.println("age arg :"+ age);
		
		boolean childAge=(age>0 && age <=5);
		if(childAge)
		{  // inside if , not visible to compiler
			System.out.println("age is child ");
			return "child";
		}
		if(age>5 && age <=12)
		{
			System.out.println("age is kid ");
			return "Kid";
		}
		
		if(age>12 && age <=19)
		{
			System.out.println("age is teen ");
			return "Teen";
		}
		if(age>50 && age <=100)
		{
			System.out.println("age is old ");
			return "Old";
		}
		System.out.println("No Match");		
		return "NO-MATCH";
	}
	
	
}