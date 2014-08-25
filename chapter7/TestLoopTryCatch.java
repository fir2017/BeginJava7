public class TestLoopTryCatch {
  public static void main(String[] args) {
    int j = 12;
    for( int i = 3; i >= -1; i--) {
      try{
        System.out.println("Enter into Try block: i = " + i + ", j = " + j);
        System.out.println(j/i);
        System.out.println("End of Try block!");
      }catch(ArithmeticException e){
        System.out.println("Enter into catch block:");
        System.out.println(e.getMessage());
        System.out.println("End catch block");
      }
    }
    System.out.println("Out of loop block!");
  }
} 
