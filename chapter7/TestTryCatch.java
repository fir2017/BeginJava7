public class TestTryCatch {
  public static void main(String[] args){
    int i=0, j=1;
    try {
      System.out.println("Entr into the try block: i=" + i + ", j=" + j);
      System.out.println(j/i);
      System.out.println("End of try block");
    }catch(ArithmeticException e){
      System.out.println("In catch block");
      System.out.println(e.getMessage());
    }
  }
}
