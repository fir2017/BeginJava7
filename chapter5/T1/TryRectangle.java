public class TryRectangle {
  public static void main (String[] args) {
    Rectangle rectangle1 = new Rectangle(1.0,1.0,2,0);
    Rectangle rectangle2 = new Rectangle(2.0,2.0, 5.0,0.0);
    Rectangle rectangle3 = new Rectangle(1.0,1.0,0,0,true);
    Rectangle combineRectangle = rectangle1.getOutRectangle(rectangle2);
    System.out.println("The out rectangle of " + rectangle1.toString() + " and " + rectangle2.toString() + " is: " + combineRectangle.toString());
    combineRectangle = rectangle1.getOutRectangle(rectangle3);
    System.out.println("The out rectangle of " + rectangle1.toString() + " and " + rectangle3.toString() + " is: " + combineRectangle.toString());
  }
}
