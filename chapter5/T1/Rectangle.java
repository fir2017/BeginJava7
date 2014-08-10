public class Rectangle {
  public static int iCounts = 0;
  public Rectangle (double leftX, double leftY, double rightX, double rightY) {
    Point tmpPoint1 = new Point(leftX, leftY);
    Point tmpPoint2 = new Point(rightX,rightY);
    switch (tmpPoint1.isLeftTopTo(tmpPoint2)){
      case 1:
        leftTopPoint = tmpPoint1;
        rightButtomPoint = tmpPoint2; 
        break;
      case 2:
        leftTopPoint = tmpPoint2;
        rightButtomPoint = tmpPoint1; 
      default:
        System.out.println("point (" + tmpPoint1 + ") and point (" + tmpPoint2 + ") can not constructed specified left-top and right-buttom rectangle");
    }
    
  }

  public Rectangle (Rectangle aRectangle) {

  }
  
  public Point getPoint(boolean bIsLeft) {
    if (bIsLeft) return leftTopPoint;
    return rightBottumPoint;
  }  
  private Point leftTopPoint;
  private Point rightButtomPoint;
}
