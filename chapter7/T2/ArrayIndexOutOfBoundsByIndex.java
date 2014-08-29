public class ArrayIndexOutOfBoundsByIndex  extends Exception {
  public ArrayIndexOutOfBoundsByIndex(){}
  public ArrayIndexOutOfBoundsByIndex(int index, Throwable cause) {
    super(cause);
    this.index = index;
  }
  
  public ArrayIndexOutOfBoundsByIndex(String message, int index, Throwable cause) {
    super(message, cause);
    this.index = index;
  }

  public int getIndex(){
    return index;
  }

  private int index = -1;
}
