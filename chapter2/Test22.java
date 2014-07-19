import static java.lang.Math.*;
public class Test22 {
  public static void main(String[] args) {
    double dblT = 17596.453652;
    long lIntegerPart = (long) floor(dblT);
    int  iDecimPart = (int) round((dblT - lIntegerPart) * 10000);
    System.out.println("The origin value is:" + dblT);
    System.out.println("The Integer Part is:" + lIntegerPart);
    System.out.println("The decimal part is:" + iDecimPart);
    System.out.println("The composition data is:" + lIntegerPart + "." + iDecimPart);
  }
}
