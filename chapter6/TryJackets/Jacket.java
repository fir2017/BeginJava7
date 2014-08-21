//package TryJackets;
public class Jacket {
  public Jacket(JacketSize size, JacketColor color){
    this.size = size;
    this.color = color;
  }
  @Override
  public String toString(){
    return "Jacket is in size of " + size + " and with color of " + color;
  }
  protected JacketSize size;
  protected JacketColor color;
}
