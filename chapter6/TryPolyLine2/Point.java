public class Point {
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public Point(Point aPoint){
    x = aPoint.x;
    y = aPoint.y;
  }
  public Point(){
    x = 0;
    y = 0;
  }
  public double[] getCoords(){
    double[] tmp = {x,y};
    return tmp;
  }
  @Override
  public String toString(){
    return x + "," + y;
  }
  protected double x;
  protected double y;
}
