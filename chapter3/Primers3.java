public class Primers3 {
  public static void main(String[] args) {
    int iNumPrimers = 50;
    OuterLoop:
    for (int i=2;;i++) {
      for(int j=2; j< i; j++){
        if ( i % j == 0 ) continue OuterLoop;
      }
      System.out.println(i);
      if (--iNumPrimers < 1) break; 
    }
  }
} 
