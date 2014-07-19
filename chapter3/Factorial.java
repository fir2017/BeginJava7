public class Factorial {
  public static void main(String[] args) {
    long lFactorial = 0;
    for(int i=1;i<=20;i++){
      lFactorial = 1;
      for(int factor=1;factor<=i;factor++){
        lFactorial *= factor;
      } 
      System.out.println(i + "! factorial:" + lFactorial);
    }
  }
}
