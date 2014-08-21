public class PolyLine {
  public PolyLine(String name, double[][] coords){
    this.name = name;
    Point[] points = new Point[coords.length];
    for (int i = 0; i < coords.length; i++) {
       points[i] = new Point(coords[i][0], coords[i][1]);
    } 
    lists = new LinkList(points);
  }
  public PolyLine(String name, Point[] points){
    this.name = name;
    lists = new LinkList(points);
  }
  public void addPoint(Point aPoint){
    lists.addItemOnEnd(aPoint);
  }
  
  public void addPoint(double x, double y) {
    addPoint(new Point(x,y));
  }

  public void addAfterCurrent(Point aPoint){
    lists.addAfterCurrent(aPoint);
  }

  public Point getFirst(){
    ListItem start = lists.getStart();
    if(start != null){
      return (Point)start.getObject();
    } 
    return null;
  }
  public Point getCurrent(){
    ListItem current = lists.getCurrent();
    if(current != null){
      return (Point)current.getObject();
    }
    return null;
  }
  @Override
  public String toString(){
    ListItem aListItem = lists.getStart();
    if(aListItem == null){
      return "null";
    }else{
      StringBuffer str = new StringBuffer(aListItem.getObject().toString());
      aListItem = lists.getNext(); 
      while(aListItem != null){
        str.append(";" + aListItem.getObject().toString());
        aListItem = lists.getNext();
      }
      return str.toString();
    } 
  }
  protected LinkList lists; 
  protected String name;
} 
