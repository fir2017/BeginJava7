public class ConditionOp {
  public static void main(String[] args){
    int iHats = 1;
    {
      System.out.println("You have total " + iHats + (iHats > 1 ? " hats":" hat"));
      iHats++;
      System.out.println("You have total " + iHats + (iHats > 1 ? " hats":" hat"));
    }
  }
}
