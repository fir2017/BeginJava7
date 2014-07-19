public class Primers2 {
  public static void main(String[] args) {
    int iNumValues = 50;
    OuterLoop:
    for ( int i=2; i<= iNumValues; i++){
      for(int j=2; j< i; j++){
        if (i % j ==0) continue OuterLoop;
      }
      System.out.println(i);
    }
  }
}
