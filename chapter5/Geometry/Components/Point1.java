package Geometry.Components;
public class Point1 {
  public static int iCount = 0;

  public Point1 (double dX, double dY){
    this.dX = dX;
    this.dY = dY;
  }
  
  public Point1 (final Point1 aPoint){
    this(aPoint.dX,aPoint.dY);
  }
  
  public void move(double dXdelta, double dYdelta) {
    dX += dXdelta;
    dY += dYdelta;
  }
  
  public double distance(final Point1 aPoint) {
    return Math.sqrt((dX - aPoint.dX) * (dX - aPoint.dX) + (dY - aPoint.dY) * (dY - aPoint.dY)); 
  }
  
  public String toString(){
    return dX + "," + dY;
  } 
  
  public double getX () {
    return dX;
  }

  public double getY () {
    return dY;
  } 
  
  public double setX (double dX ) {
    double dTemp = this.dX;
    this.dX = dX;
    return dTemp;
  }

  public double setY (double dY ) {
    double dTemp = this.dY;
    this.dY = dY;
    return dTemp;
  }
  private double dX;
  private double dY;
}
