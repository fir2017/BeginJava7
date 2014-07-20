public class JoinStrings {
  public static void main (String[] args) {
    int[] iaFiveNum = {1,2,3,4,5};
    String sFirstString = "Many ";
    String sSecondString = "hands ";
    String sThirdString = "make light work";
    
    String sJoinedString = null;
    sJoinedString = sFirstString + sSecondString + sThirdString;
    System.out.println(sJoinedString);
    int iNumHands = 99;
    sJoinedString = iNumHands + " " + sSecondString + sThirdString;
    System.out.println(sJoinedString);
    
    System.out.print("The result of \'\"fifty-five is \" + 5 + 5\' is: ");
    sJoinedString = "fifty-five is " + 5 + 5;
    System.out.println(sJoinedString);
   
    sJoinedString = 5 + 5 + " is ten"; 
    System.out.print("The result of \'5 + 5 + \" is ten\" is: ");
    System.out.println(sJoinedString);
    
    sJoinedString = iaFiveNum.toString() + iNumHands;
    
    System.out.println(sJoinedString);
  }
}
