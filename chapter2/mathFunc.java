import static java.lang.Math.*;
public class mathFunc {
  public static void main (String[] args) {
    int totalFishs = 20;
    double fishLen = 10;
    double inchesPerFeet4Fish = 2;
    double radio = 0;

    double totalInches = totalFishs * fishLen;
    double totalFeets = totalInches / inchesPerFeet4Fish;    
    
    radio = sqrt(totalFeets / PI);
    System.out.println("The radio of pand is:" + radio + " feets");
    int radioFeets = (int)(floor(radio));
    int remainInches = (int)(rint(12 * (radio - radioFeets)));
    System.out.println("That the radio of pand is:" + radioFeets + " feets and " + remainInches + " inches");
  }
}
