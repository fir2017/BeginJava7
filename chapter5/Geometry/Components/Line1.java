package Geometry.Components;

public class Line1 {
  public static int iCount = 0;
  
  public Line1 (final Point1 startPoint, final Point1 endPoint){
    start = new Point1(startPoint);
    end = new Point1(endPoint);
    iCount++;
  }
  
  public Line1 (double dStartX, double dStartY, double dEndX, double dEndY) {
    start = new Point1(dStartX,dStartY);
    end = new Point1(dEndX,dEndY);
  }
  
  public double length () {
    return start.distance(end);
  }
  
  public String toString () {
    return "(" +start.toString() + ") : (" + end.toString() + ")";
    //return "--";
  }  

  public Point1 interSect (Line1 aLine) {
    Point1 connectPoint = new Point1(0.0,0.0);
    double num = (end.getY() - start.getY()) * (start.getX() - aLine.getStart().getX()) - (end.getX() - start.getX()) * (start.getY() - aLine.getStart().getY());
    double denom = (end.getY() - start.getY()) * (aLine.end.getX() - aLine.start.getX()) - (end.getX() - start.getX()) * (aLine.end.getY() - aLine.start.getY());
    
    connectPoint.setX(aLine.start.getX() + (aLine.end.getX() - aLine.start.getX()) * num / denom);
    connectPoint.setY(aLine.start.getY() + (aLine.end.getY() - aLine.start.getY()) * num / denom);
    return connectPoint;
  }

  public Point1 getStart(){
    return start;
  }

  public Point1 getEnd(){
    return end;
  }

  public Point1 setStart (final Point1 startPoint) {
    Point1 Tmp = start;
    start = new Point1(startPoint);
    return Tmp;
  }

  public Point1 setEnd (final Point1 endPoint) {
    Point1 Tmp = end;
    end = new Point1(endPoint);
    return Tmp;
  }

  private Point1 start;
  private Point1 end;
}
