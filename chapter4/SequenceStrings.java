public class SequenceStrings {
  public static void main (String[] args) {
    String sString1 = "\'A\'";
    String sString2 = "\'to\'";
    String sString3 = "\'z\'";
    
    int iCompareReturn = sString1.compareTo(sString3);
    if (iCompareReturn > 0) {
      System.out.println(sString1 + " is great than " + sString3);
    } else if (iCompareReturn < 0) {
      System.out.println(sString1 + " is less than " + sString3);
    } else {
      System.out.println(sString1 + " is equal to " + sString3);
    }
    
    iCompareReturn = sString2.compareTo(sString1);
    if (iCompareReturn > 0) {
      System.out.println(sString2 + " is great than " + sString1);
    } else if (iCompareReturn < 0) {
      System.out.println(sString2 + " is less than " + sString1);
    } else {
      System.out.println(sString2 + " is equal to " + sString1);
    }
    
    int[] iaT = {1,2,3};
    boolean bResult = sString1.equals(iaT);
    System.out.println(iCompareReturn);
  }
}
