import static java.lang.Math.*;
public class Chapter3T2 {
  public static void main (String [] args) {
    int iNumValues = 50;
    TestValue:
    for(int i=2; i<=iNumValues; i++){
      int iUpperInt = (int) (ceil(sqrt(i)));
      for(int j=2; j<=iUpperInt; j++){
         if (i % j == 0) continue TestValue;
      }
      System.out.println(i);
    }
  }
}
