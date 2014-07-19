public class Factorial2 {
  public static void main(String[] args) {
    long lFactorial = 0;
    
    FistLoop:
    for (int i=1;i<=20;i++){
      lFactorial = 1;
      for (int factor = 1;factor<=i;factor++) {
        if (i>10 && i % 2 == 0 ){
          continue FistLoop;
        }
        lFactorial *= factor;
      } 
      System.out.println(i + "! is " + lFactorial);
    }
  }
}
