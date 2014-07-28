import static java.lang.Math.*;
public class Chapter4T1 {
  public static void main(String[] args) {
    String[] saMonthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    float[] faSamples = new float[saMonthName.length];
    for (int i=0; i < faSamples.length; i++){
      faSamples[i] = (float)(random() * 100);
    }
    float fAverage = 0.0f;
    for (int i=0; i < faSamples.length; i++) {
      System.out.println(saMonthName[i] + ":" + faSamples[i]);
      fAverage += faSamples[i];
    }
    System.out.println("The average of Samples is: " + fAverage/faSamples.length);
  }
}
