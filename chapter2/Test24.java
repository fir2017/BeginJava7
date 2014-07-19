import static java.lang.Math.*;
public class Test24 {
  public static void main (String[] args){
    long lSunDirect = 865_000;
    long lEarthDirect = 7_600;
    long lVolumnSun = (long) pow(lSunDirect,3);
    long lVolumnEarth = (long) pow(lEarthDirect,3);
    double dblRatio = lVolumnSun/lVolumnEarth;
    System.out.println("The volumn of Sun in mile is:" + lVolumnSun);
    System.out.println("The volumn of Earth in mile is:" + lVolumnEarth);
    System.out.println("The ratio of Sun and Earth in volumn is:" + dblRatio);
  }
}
