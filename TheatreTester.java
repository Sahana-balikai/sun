public class TheatreTester{


public static void main(String[] movies)
{

System.out.println("invoked main, doing switch and enum");

TheatreFinder.lowestAndBestUsingString("whatver ");
	String theatreName="SPICINEMA";
	Theatre enumTheatreName=Theatre.valueOf(theatreName);
TheatreFinder.lowestAndBestUsingEnum(enumTheatreName);

System.out.println("EXIT :: main, doing switch and enum");
}

}