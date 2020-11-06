public class MobileTester{
	public static void main(String[] runT)
	{
		System.out.println("JVM invoked main ");
		String unlockValue=Mobile.getUnlock();
		
		System.out.println("unlockValue" +unlockValue);
		
		Mobile.setUnlock("FingerPrint");
		
		unlockValue=Mobile.getUnlock();
		System.out.println("unlockValue" +unlockValue);
		
		System.out.println("EXIT ::main");
		
	}
}