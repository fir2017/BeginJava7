public class N2IExceptions extends Exception {
  public N2IExceptions(int i, Exception e){
    super("negative index for array: " + i, e);
    index = i;
    type = -1;
  }
  public N2IExceptions(Exception e){
    super(e);
    type = 0;
    index = 0;
  }
  public N2IExceptions(int i, int arrayLen, Exception e){
    super("Index out of Bounds for array(length = " + arrayLen + "): " + i, e);
    index = i;
    type = 1;
  }
  public String getMessage(){
    String s = super.getMessage();
    switch(type){
      case -1:
        return "Negative" + "\n" + s;
      case 0:
        return "Array is null" + "\n" + s;
      case 1:
        return "Out Bounds" + "\n" + s;
      default:
        return "Unknow type" + "\n" + s;
    }
  }
  public int getIndex(){
    return index;
  }
  private int type;
  private int index; 
}
