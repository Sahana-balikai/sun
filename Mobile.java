public class Mobile
{
	private static String unlock="Pin";
	//getter method
	public static String getUnlock()
	{
		return unlock;
	}
	
	//setter method
	public static void setUnlock(String newUnlock)
	{
		if(newUnlock.equals("FingerPrint")||newUnlock.equals("pattern")||newUnlock.equals("face")||newUnlock.equals("password"))//compare the string
		{
			System.out.println("new unlock is "+newUnlock);
			unlock=newUnlock;
		}
		else{
			System.out.println("you cannot change the unlock");
		}
	}
}