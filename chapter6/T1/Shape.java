public abstract class Shape {
  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public void move (double x, double y){
    this.x += x;
    this.y += y;
  } 
  
  public abstract Object Show(); 
  protected double x;
  protected double y;
}
