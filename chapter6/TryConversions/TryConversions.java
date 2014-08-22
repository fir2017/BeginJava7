import static conversions.ConversionFactors.*;
public class TryConversions {
  public static void main (String[] args) {
    int weightInPounds = 180;
    int heightInInches = 75;
    System.out.println("Weight:" + weightInPounds + " is " + pounds2Grames(weightInPounds) + " Grames");
    System.out.println("Height:" + heightInInches + " is " + inches2Millimeters(heightInInches) + " Grames");
  }
  public static double pounds2Grames (double pounds){
    return pounds * POUND2GRAM; 
  }
  public static double inches2Millimeters (double inches) {
    return INCH2MM * inches;
  }
}
