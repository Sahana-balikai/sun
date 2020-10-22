public class Online{

public static void main(String[] trainees)
{
	
	System.out.println("JVM invoked main");
	//print refernce representation
	System.out.println("trainees "+ trainees);
	
	int sizeOfMainParam=trainees.length;
	System.out.println("sizeOfMainParam " +sizeOfMainParam);
	System.out.println("Element @ index 0 "+trainees[0]);
	System.out.println("Element @ index 1 "+trainees[1]);
	System.out.println("exit main");
}


}