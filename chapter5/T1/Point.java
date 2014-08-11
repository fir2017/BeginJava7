public class Point {
  public static void main (String[] args) {
    Point aPoint1 = new Point(1.0,1.0);
    System.out.println("point: (" + aPoint1.toString() + ") is " + aPoint1.isLeftTopToAsStr(new Point(2.0,2.0)) + " to point(2.0,2.0)");
    System.out.println("point: (" + aPoint1.toString() + ") is " + aPoint1.isLeftTopToAsStr(new Point(0.0,0.0)) + " to point(0.0,0.0)");
    System.out.println("point: (" + aPoint1.toString() + ") is " + aPoint1.isLeftTopToAsStr(new Point(2.0,0.0)) + " to point(2.0,0.0)");
    System.out.println("point: (" + aPoint1.toString() + ") is " + aPoint1.isLeftTopToAsStr(new Point(0.0,2.0)) + " to point(0.0,2.0)");
  }

  public Point (double dX, double dY){
    this.dX = dX;
    this.dY = dY;
  }
  public Point (Point aPoint) {
    dX = aPoint.getX();
    dY = aPoint.getY();
  }
  public double getX () {
    return dX;
  }
  public void setX(double dX){
    this.dX = dX;
  }
  public double getY () {
    return dY;
  }
  public void setY ( double dY ) {
    this.dY = dY;
  }
  /*                               dY
  *			> getY | == getY | < getY
  *                        01      00        10
  *  |  | >  getX| 01|    0101    0001      1001        5  1  9
  *  |dX| == getX| 00|    0100    0000      1000    =>  4  0  8
  *  |  | <  getX| 10|    0110    0010      1010        6  2  10
  */
  public int relativePositionTo ( Point aPoint) {
    int iRelX,iRelY;
    double dTemp = dX - aPoint.getX();
    if (dTemp > 0 ) {
      iRelX = 1;
    } else if (dTemp == 0) {
      iRelX = 0;
    }else{
      iRelX = 2;
    } 

    dTemp = dY - aPoint.getY();
    if (dTemp > 0) {
      iRelY = 1;
    }else if (dTemp == 0) {
      iRelY = 0;
    } else {
      iRelY = 2;
    }
    iRelY = iRelY << 2;
    return iRelY | iRelX;
  }
  
  // 0: no left top to each other
  // 1: current left top to aPoint
  // 2: current right buttom to aPoint 
  public int isLeftTopTo (Point aPoint) {
    switch (relativePositionTo (aPoint)) {
      case 6:
        return 1;
      case 9:
        return 2;
      default:
        return 0;
    }  
  }
  public String isLeftTopToAsStr (Point aPoint) {
    switch (relativePositionTo (aPoint)) {
      case 6:
        return "LeftTop";
      case 9:
        return "RightBottum";
      default:
        return "No left-top and right-bottum relationship";
    }  
  }
  
  public String toString (){
    return dX + "," + dY;
  }
  private double dX;
  private double dY;
}
