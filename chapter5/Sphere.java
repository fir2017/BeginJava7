public class Sphere {
  static int count = 0;
  static final double PI = Math.PI;
  
  double dRadius;
  double dX, dY, dZ;
  
  Sphere (){
    dX = dY = dZ =0.0;
    dRadius = 1.0;
    count++;
  }

  Sphere (double dX, double dY, double dZ) {
    this.dX = dX;
    this.dY = dY;
    this.dZ = dZ;
    dRadius = 1.0;
    count++;
  }
  
  Sphere ( double dRadius,double dX, double dY, double dZ ) {
    this.dRadius = dRadius;
    this.dX = dX;
    this.dY = dY;
    this.dZ = dZ;
    count++;
  }
  double getVolumn () {
    return 4.0/3.0 * PI * dRadius * dRadius * dRadius;
  }
}
