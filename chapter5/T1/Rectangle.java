public class Rectangle {
  public static int iCounts = 0;
  public Rectangle (double leftX, double leftY, double rightX, double rightY) {
    Point tmpPoint1 = new Point(leftX, leftY);
    Point tmpPoint2 = new Point(rightX,rightY);
    switch (tmpPoint1.isLeftTopTo(tmpPoint2)){
      case 1:
        leftTopPoint = tmpPoint1;
        rightBottomPoint = tmpPoint2; 
        break;
      case 2:
        leftTopPoint = tmpPoint2;
        rightBottomPoint = tmpPoint1; 
      default:
        System.out.println("point (" + tmpPoint1 + ") and point (" + tmpPoint2 + ") can not constructed specified left-top and right-buttom rectangle");
    }
  }

  public Rectangle (Rectangle aRectangle) {
    leftTopPoint = new Point(aRectangle.getLeftTopPoint().getX(), aRectangle.getLeftTopPoint().getY());
    rightBottomPoint = new Point(aRectangle.getRightBottomPoint().getX(), aRectangle.getRightBottomPoint().getY());
  }
  
  public Rectangle (double leftX, double leftY, double rightX, double rightY, boolean bAutoAdjust) {
    if (leftX == rightX | leftY == rightY) {
        System.out.println("point ("+leftX + "," + leftY + ") and point (" + rightX + "," + rightY + ") can not constructed specified left-top and right-buttom rectangle");
    }
    if (! bAutoAdjust) {
      Point tmpPoint1 = new Point(leftX, leftY);
      Point tmpPoint2 = new Point(rightX,rightY);
      switch (tmpPoint1.isLeftTopTo(tmpPoint2)){
        case 1:
          leftTopPoint = tmpPoint1;
          rightBottomPoint = tmpPoint2; 
          break;
        case 2:
          leftTopPoint = tmpPoint2;
          rightBottomPoint = tmpPoint1; 
        default:
          System.out.println("point (" + tmpPoint1 + ") and point (" + tmpPoint2 + ") can not constructed specified left-top and right-buttom rectangle");
      }
      //this(leftX, leftY, rightX, rightY);
    }else{
      leftTopPoint = new Point( leftX > rightX ? rightX : leftX, leftY > rightY ? leftY : rightY);
      rightBottomPoint = new Point( leftX > rightX ? leftX : rightX, leftY > rightY ? rightY : leftY);
    }
  }
  
  public Rectangle getOutRectangle (Rectangle aRectangle) {
    double dMinX = leftTopPoint.getX();
    double dMaxY = leftTopPoint.getY();
    double dMaxX = rightBottomPoint.getX();
    double dMinY = rightBottomPoint.getY();
    if (dMinX > aRectangle.getLeftTopPoint().getX()) dMinX = aRectangle.getLeftTopPoint().getX();
    if (dMaxY < aRectangle.getLeftTopPoint().getY()) dMaxY = aRectangle.getLeftTopPoint().getY();
    if (dMaxX < aRectangle.getRightBottomPoint().getX()) dMaxX = aRectangle.getRightBottomPoint().getX();
    if (dMinY > aRectangle.getRightBottomPoint().getY()) dMinY = aRectangle.getRightBottomPoint().getY();
    return new Rectangle(dMinX,dMaxY,dMaxX,dMinY);
  }
  
  public String toString(){
    return "Rectangle:(" + getPoint(true).toString() + "),(" + getPoint(false) + ")";  
  }
  
  public Point getLeftTopPoint (){
    return leftTopPoint;
  }
  public Point getRightBottomPoint (){
    return rightBottomPoint;
  }
  
  public Point getPoint(boolean bIsLeft) {
    if (bIsLeft) return leftTopPoint;
    return rightBottomPoint;
  }  
  private Point leftTopPoint;
  private Point rightBottomPoint;
}
