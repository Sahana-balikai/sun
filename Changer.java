public class Changer{
public static void main(String[] conv)
{
String changer="57";

byte converter=Byte.parseByte(changer);
System.out.println("byte form of string is:"+ converter);

short convert=Short.parseShort(changer);
System.out.println("short form of string is:"+ convert);

int change=Integer.parseInt(changer);
System.out.println("int form of string is:"+ change);

long choose=Long.parseLong(changer);
System.out.println("long form of string is:"+ choose);

float choice=Float.parseFloat(changer);
System.out.println("float form of string is:"+ choice);

double select=Double.parseDouble(changer);
System.out.println("double form of string is:"+ select);

boolean option=Boolean.parseBoolean(changer);
System.out.println("boolean form of string is:"+ option);

//char opt=Character.parseChar(alpha);
//System.out.println("char form of string is:"+opt);

}
}
