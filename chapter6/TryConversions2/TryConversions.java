import static conversions.ConversionFactors.*;
public class TryConversions implements Conversions {
  public double inches2Millimeters (double inches){
    return INCH2MM * inches; 
  }
  public double ounches2Grams (double ounces){
    return OUNCE2GRAM * ounces; 
  }
  public double pounds2Grams (double pounds){
    return pounds * POUND2GRAM; 
  }
  public double hp2Watt (double hps){
    return HP2WATT * hps; 
  }
  public double watts2HP (double watts){
    return watts * WATT2HP; 
  }
  public static void main (String[] args){
    double weightInPounds = 180;
    double heightInInches = 75;
    TryConversions trs = new TryConversions();
    System.out.println("Weight in " + weightInPounds + " pounds is " + trs.pounds2Grams(weightInPounds) + " grams"); 
    System.out.println("Height in " + heightInInches + " inches is " + trs.inches2Millimeters(heightInInches) + " millimeters"); 
  }
}
