public class TestLoopTryCatch2 {
  public static void main (String[] args) {
    int j = 12;
    try{
      System.out.println("Enter into try block!");
      for(int i=3; i > -2; i--){
        System.out.print("i = " + i + ", j = " + j + ":");
        System.out.println(j/i); 
        System.out.println("After Arithmetic calculation!");
      }
    }catch(ArithmeticException e) {
      System.out.println("Enter into the catch block");
      System.out.println(e.getMessage());
      System.out.println("Out of catch block!");
    }
    System.out.println("Out of try block");
  }
}
