public class Globe{
public static void main(String[] round)
{
String coin="5";
String note="2000";
String salary="55000";
String experience="2.5";
String populationOfIndia="1350000000";
String valueOfConstanth="6.62607015";
String sunIsAStar="true";

byte converter=Byte.parseByte(coin);
System.out.println("byte form of string is:"+ converter);

short convert=Short.parseShort(note);
System.out.println("short form of string is:"+ convert);

int change=Integer.parseInt(salary);
System.out.println("int form of string is:"+ change);

long choose=Long.parseLong(populationOfIndia);
System.out.println("long form of string is:"+ choose);

float choice=Float.parseFloat(experience);
System.out.println("float form of string is:"+ choice);

double select=Double.parseDouble(valueOfConstanth);
System.out.println("double form of string is:"+ select);

boolean option=Boolean.parseBoolean(sunIsAStar);
System.out.println("boolean form of string is:"+ option);


}
}