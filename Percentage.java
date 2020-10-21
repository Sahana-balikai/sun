public class Percentage{
	
	public static void main(String[] score)
	{
		System.out.println("invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("exiting main method by JVM");
	}
	
	
	
	public static void arrayOfPercentage()
	{
		 System.out.println("invoked arrayOfPercentage");
	
		 float SSlCPercentage=93.28f;
		 float PUPercentage=85.5f;
		 float DEGREEPercentage=76.7f;
	     
		 
		 //array is group of similar types
	     float[] Percentages={SSlCPercentage,PUPercentage,DEGREEPercentage};
		 int sizeOfPercentage=Percentages.length;
		 System.out.println("Total elements "+sizeOfPercentage);
		 
		 
		 float elementAtIndex1=Percentages[1];
		 
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		 float elementAtIndex2=Percentages[2];
		 
		 System.out.println("Element at index three "+elementAtIndex2);
		 
		 float elementAtIndex3=Percentages[1];
		 
		 System.out.println("Element at index four "+elementAtIndex3);
	
	}
	
	
	
}
