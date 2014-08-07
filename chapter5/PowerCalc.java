public class PowerCalc {
  static double power(double x, int n){
    if (n > 0 ) return x * power(x, n-1);
    else if (n < 0 ) return 1/power(x, -n);
    else return n = 1; 
  }
  
  public static void main (String[] args) {
    System.out.println("5 to the power 4 is: " + power(5.0,4));
    System.out.println("7.5 to the power 5 is: " + power(7.5,5));
    System.out.println("7.5 to the power 0 is: " + power(7.5,0));
    System.out.println("10.0 to the power -2 is: " + power(10.0,-2));
  }
}
