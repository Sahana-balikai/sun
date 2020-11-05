public class ArrayDefaultValues {
   int intArray[] = new int[3];
   float floatArray[] = new float[3];
   byte byteArray[] = new byte[3];
   boolean boolArray[] = new boolean[3];
   String stringArray[] = new String[3];
   public static void main(String args[]){
      ArrayDefaultValues obj = new ArrayDefaultValues();
      System.out.println(Arrays.toString(obj.intArray));
      System.out.println(Arrays.toString(obj.floatArray));
      System.out.println(Arrays.toString(obj.byteArray));
      System.out.println(Arrays.toString(obj.boolArray));
      System.out.println(Arrays.toString(obj.stringArray));
   }
}