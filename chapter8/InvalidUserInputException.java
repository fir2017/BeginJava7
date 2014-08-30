public class InvalidUserInputException extends Exception{
  public InvalidUserInputException(){}
  public InvalidUserInputException(String message){
    super(message);
  }
  public InvalidUserInputException(String message, String invalidStr){
    super(message);
    this.invalidStr = invalidStr;
  }
  public String getInvalidStr(){
    return invalidStr;
  }
  private String invalidStr = null;
}
