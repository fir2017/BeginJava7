class Point {
  double dX;
  double dY;
  static int iCount = 0;
  
  Point (double dX, double dY){
    this.dX = dX;
    this.dY = dY;
  }
  
  Point (final Point aPoint){
    this(aPoint.dX,aPoint.dY);
  }
  
  void move(double dXdelta, double dYdelta) {
    dX += dXdelta;
    dY += dYdelta;
  }
  
  double distance(final Point aPoint) {
    return Math.sqrt((dX - aPoint.dX) * (dX - aPoint.dX) + (dY - aPoint.dY) * (dY - aPoint.dY)); 
  }
  
  public String toString(){
    return dX + "," + dY;
  } 
}
