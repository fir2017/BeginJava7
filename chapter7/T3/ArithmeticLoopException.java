public class ArithmeticLoopException extends Exception {
  public ArithmeticLoopException(){}
  public ArithmeticLoopException(String message, Throwable cause){
    super(message,cause);
  }
  public ArithmeticLoopException(String message,int index, Throwable cause){
    super(message,cause);
    loopIndex = index;
  }
  
  public int getLoopIndex(){
    return loopIndex;
  }
  
  private int loopIndex = -1 ; 
}
