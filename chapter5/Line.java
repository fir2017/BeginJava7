class Line {
  Point start;
  Point end;
  static int iCount = 0;
  
  Line (final Point startPoint, final Point endPoint){
    start = new Point(startPoint);
    end = new Point(endPoint);
    iCount++;
  }
  
  Line (double dStartX, double dStartY, double dEndX, double dEndY) {
    start = new Point(dStartX,dStartY);
    end = new Point(dEndX,dEndY);
  }
  
  double length () {
    return start.distance(end);
  }
  
  public String toString () {
    return "Start:" + start.toString() + "; End:" + end.toString();
  }  

  Point interSect (Line aLine) {
    Point connectPoint = new Point(0.0,0.0);
    double num = (end.dY - start.dY) * (start.dX - aLine.start.dX) - (end.dX - start.dX) * (start.dY - aLine.start.dY);
    double denom = (end.dY - start.dY) * (aLine.end.dX - aLine.start.dX) - (end.dX - start.dX) * (aLine.end.dY - aLine.start.dY);
    
    connectPoint.dX = aLine.start.dX + (aLine.end.dX - aLine.start.dX) * num / denom;
    connectPoint.dY = aLine.start.dY + (aLine.end.dY - aLine.start.dY) * num / denom;
    return connectPoint;
  }
}
