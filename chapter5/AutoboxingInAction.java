public class AutoboxingInAction {
  public static void main (String[] args) {
    int[] iaValues = {1,3,5,7,9};
    Integer[] IntaValues = new Integer[iaValues.length];
    
    for (int i=0; i < iaValues.length; i++) IntaValues[i] = iaValues[i];   
    /* same to :
      for(int i = 0; i < iaValues.length; i++) {
      IntaValues[i] = boxInteger(iaValues[i]);
     }
    */
    for(Integer IntValue : IntaValues) {
      unboxingInteger(IntValue);
    }
  }
  static Integer boxInteger(Integer IntIn){
    return IntIn;
  }
  static void unboxingInteger ( int iIn ) {
    System.out.println("input is: " + iIn);
  }

}
