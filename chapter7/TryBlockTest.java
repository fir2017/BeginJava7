import java.io.IOException;
public class TryBlockTest {
  public static void main (String[] args) {
    int[] array = {10,5,0};
    try {
      System.out.println("Enter into the first try block in main!");
      System.out.println("Result = " + divided(array,0));
      array[1] = 0;
      System.out.println("Result = " + divided(array,0));
      array[1] = 1;
      System.out.println("Result = " + divided(array,1));
    }catch(ArithmeticException e) {
      System.out.println("Enter into ArithmeticException catch block in main!");
      System.out.println(e.getMessage());
      System.out.println("End of ArithMeticException catch block in main!");
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Enter into ArrayIndexOutOfBoundsException catch block in main");
      System.out.println(e.getMessage());
      System.out.println("End of ArrayIndexOutOfBoundsException catch block in main!");
    }
    
    System.out.println("Out of first try block!");
    System.out.println("Enter any key to exit!");
    
    try{
      System.out.println("Enter into the second try block in main!");
      System.in.read();
      System.out.println("End of second try block in main!"); 
    }catch(IOException e){
      System.out.println("Enter into the IOException block in main!");
      System.out.println(e.getMessage());
      System.out.println("End of second try in IOException in main!");
    }finally{
      System.out.println("Enter into finally block in second try in main!");
    }
   
    System.out.println("out the second try block in main!");
  }
  public static int divided (int[] array, int index) {
    try{
      System.out.println("Enter into the divived method in try block!");
      array[index + 2] = array[index]/array[index + 1];
      System.out.println("end in the try block in divided method");
      return array[index + 2];
    /*
    }catch (ArithmeticException e){
      System.out.println("Arithmetic Exception in divided block");
      System.out.println(e.getMessage());
      System.out.println("index = " + index + ", expression: array[" + index + "]/array[" + (index + 1) + "] = " + array[index] + "/" + array[index + 1]);
      System.out.println("Out of ArithmeticException");
    */
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException in divided method!");
      System.out.println(e.getMessage());
      System.out.println("index = " + index + ", The lenth of array " + array.length);
      System.out.println("Out of ArrayIndexOutOfBoundsException");
    }finally {
      System.out.println("In finally block in divided!");
    }
    System.out.println("Out of try block in divided method!");
    return array[index + 2];
  } 
} 

