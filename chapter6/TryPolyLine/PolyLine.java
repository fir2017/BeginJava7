public class PolyLine {
  public PolyLine(String name, Point[] points){
    this.name = name;
    for(Point p : points){
      addPoint(p);
    }
  }
  public PolyLine(String name){
    this.name = name;
  }
  public PolyLine(String name,double[][] coords){
    this.name = name;
    if(coords != null){
      for(int i=0; i < coords.length; i++){
        addPoint(coords[i][0],coords[i][1]);
      }
    }
  }
  public void addPoint(Point aPoint){
    ListPoint currentPoint = new ListPoint(aPoint);
    if(start == null) {
      start = currentPoint;
    }else{
      end.setNext(currentPoint);
    }
    end = currentPoint;
  }
  public void addPoint(double x, double y) {
    addPoint(new Point(x,y));
  }
  public String toString(){
    StringBuffer str = new StringBuffer("The polyline \"" + name + "\" compsist of:\n");
    if (start == null){
      return str.append("null").toString();
    }
    ListPoint current = start;
    while(current != null){
      str.append(" " + current);
      current = current.getNext();
    }    
    return str.toString();
  }
  protected String name;
  protected ListPoint start;
  protected ListPoint end;
}
