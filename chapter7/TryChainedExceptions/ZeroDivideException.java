public class ZeroDivideException extends Exception {
  public ZeroDivideException(){}
  public ZeroDivideException(String message, Throwable cause){
    super(message, cause);
  }
  public ZeroDivideException(int index, Throwable cause) {
    super(cause);
    this.index = index;
  }
  
  public int getIndex(){
    return index;
  }
  private int index = -1;
}
