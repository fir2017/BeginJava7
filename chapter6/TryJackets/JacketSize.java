//package TryJackets; 
public enum JacketSize {
  small(36,"for samll"), medium(40,"for youn"), large(42,"for audor"), extra_large(46,"for fat"), extra_extra_large(48,"for very fat");
  JacketSize (int checkSize,String suitefor){
    this.checkSize = checkSize;
    this.suiteFor = suitefor;
  }
  public int getSize(){
    return checkSize;
  }
  public String getSuite(){
   return suiteFor;
  }
  @Override
  public String toString(){
    switch(this){
      case small:
        return "S";
      case medium:
        return "M";
      case large:
        return "L";
      case extra_large:
        return "XL";
      case extra_extra_large:
        return "XXL";
      default:
       return "unkown";
    }
  }
  public void setSize(int size){
    checkSize = size;
  }
  private int checkSize;
  private String suiteFor;
}
