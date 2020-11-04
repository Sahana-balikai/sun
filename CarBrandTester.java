public class CarBrandTester
{
	public static void main(String[] cars)
	{
		System.out.println("JVM invoked main");
		
		String[] car=CarBrand.getBrands();
		
		for(byte nameOfCar=0;nameOfCar<car.length;nameOfCar++)
		{
			
		System.out.println("car name at " + nameOfCar + " is: " + car[nameOfCar]);
		}
		System.out.println("The count of cars in main method: "+ car.length);
		System.out.println("Exit :: main");
	}
}
