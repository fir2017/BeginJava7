package TryJackets; 
public enum JacketSize {
  small(36), medium(40), large(42), extra_large(46), extra_extra_large(48);
  JacketSize (int checkSize){
    this.checkSize = checkSize;
  }
  public int getSize(){
    return checkSize;
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
  private int checkSize;
}
