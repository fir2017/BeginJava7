public class Sphere {
  static int count = 0;
  static final double PI = Math.PI;
  
  double dRadius;
  double dX, dY, dZ;
  
  Sphere ( double dRadius,double dX, double dY, double dZ ) {
    this.dRadius = dRadius;
    this.dX = dX;
    this.dY = dY;
    this.dZ = dZ;
    count++;
  }
  double getVolumn () {
    return 4.0/3.0 * dRadius * dRadius * dRadius;
  }
}
