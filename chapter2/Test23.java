import static java.lang.Math.*;
public class Test23 {
  public static void main(String[] args) {
    double dblIncome = 123458.56;
    double dblRatio = 0.35;
    int iNumDollar = (int) floor(dblIncome * dblRatio);
    int iNumCent = (int) round((dblIncome * dblRatio - iNumDollar)*100);
    System.out.println("The ratio for income " + dblIncome + " is " + iNumDollar + "." + iNumCent);
  }
}
