public class TheatreFinder{


public static void lowestAndBestUsingString(String theatreName)
{
	System.out.println("invoked lowestAndBestUsingString");
	System.out.println("arg 1 theatreName "+theatreName);
	switch(theatreName){
			case "PVR":
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Dil Bechara");
				System.out.println("cost is 300");
				break;
			case "INOX":
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Chichore");
				System.out.println("cost is 400");
				break;
			case "CINEMAX":
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Sadak");
				System.out.println("cost is 350");
				break;
			case "BIGCINEMA":
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Baaghi 3");
				System.out.println("cost is 320");
				break;
			
			default :
				System.out.println("no theatre macthed");
		
	}
	
	System.out.println("EXIt:: lowestAndBestUsingString");
	
}


public static void lowestAndBestUsingEnum(Theatre theatreName)
{

System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 theatreName "+theatreName);	
	switch(theatreName){
		case PVR:
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Dil Bechara");
				System.out.println("cost is 300");
				break;
		case INOX:
				System.out.println("case is " +theatreName);
				System.out.println("cinema: Chichore");
				System.out.println("cost is 400");
				break;
		default :
				System.out.println("no theatre matched");
	}
	
	System.out.println("EXIt:: lowestAndBestUsingEnum");
}

}