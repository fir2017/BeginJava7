public class ListPoint {
  public ListPoint(Point aPoint) {
    point = new Point(aPoint);
    next = null;
  } 
  public void setNext(ListPoint aListPoint){
    //System.out.println(aListPoint);
    next = aListPoint;
  }
  public ListPoint getNext(){
    return next;
  }
  @Override
  public String toString(){
    return "(" + point + ")";
  }
  public double[] getPoint(){
    //double[] tmp = new double[2];
    //tmp[0] = x;
    //tmp[1] = y;
    //return tmp;
    return point.getCoords();
  }
  protected Point point;
  protected ListPoint next;
}
