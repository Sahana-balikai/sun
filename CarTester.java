public class CarTester
{
	public static void main(String[] vehicle)
	{
		System.out.println("JVM invokes main");
		String car="lamborghini Urus";
		Car.Model(car);
		Car.Model(100000);
		Car.Model(5,"BS6");
		
		System.out.println("exit from main");
	}
}