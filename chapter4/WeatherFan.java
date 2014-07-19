import static java.lang.Math.*;
public class WeatherFan {
  public static void main (String[] args) {
    float[][] faTenLocationWeather = new float[10][365];
    for (int i=0; i < faTenLocationWeather.length; i++) {
      for (int j=0; j < faTenLocationWeather[i].length; j++) {
        faTenLocationWeather[i][j] = (float)(random()*42);
      } 
    }
    for (int i=0; i < faTenLocationWeather.length; i++){
      float fTotalTemperature = 0.0f;
      for (int j=0; j < faTenLocationWeather[i].length; j++) {
         fTotalTemperature += faTenLocationWeather[i][j];
      }
      System.out.println("The average temperature at Location " + (i+1) + " is " + fTotalTemperature / faTenLocationWeather[i].length);
    }
 
  }
}
