public class TryGeometry {
  public static void main (String[] args) {
    Point start = new Point(0.0, 1.0);
    Point end = new Point(5.0, 6.0);
    System.out.println("points start at: " + start.toString() + ", and end at: " + end.toString());
    System.out.println("The distance of the points: " + start.distance(end));
    
    Line line1 = new Line(start,end);
    Line line2 = new Line(0.0, 3.0, 3.0, 0.0);
    System.out.println("Two lines created: " + line1.toString() + ", and: " + line2.toString());
    
    System.out.println("Intersect point of" + line1 + " and " + line2 +" at: " + line1.interSect(line2).toString());
    
    start.move(10.2, -0.5);
    System.out.println("start point move to: " + start); 
    System.out.println("The distance of start and end point: " + start.distance(end));
    System.out.println("Intersect point of" + line1 + " and " + line2 +" at: " + line1.interSect(line2).toString());
  }
} 
