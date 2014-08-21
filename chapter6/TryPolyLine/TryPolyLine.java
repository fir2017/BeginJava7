public class TryPolyLine {
  public static void main (String[] args) {
    double[][] coords = {{1,1},{1,2},{2,3},{-3,5},{-5,1},{0,0}}; 
    PolyLine polyLine = new PolyLine("First",coords); 
    System.out.println(polyLine);
    polyLine.addPoint(90.5,100.8);
    System.out.println(polyLine);
    
    Point[] points = new Point[coords.length];
    for(int i = 0; i < coords.length; i++){
      points[i] = new Point(coords[i][0], coords[i][1]);
    }
    PolyLine polyLine1 = new PolyLine("Second", points);
    System.out.println(polyLine1);
  }
}
