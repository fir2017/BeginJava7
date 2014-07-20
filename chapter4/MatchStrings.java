public class MatchStrings {
  public static void main (String[] args){
    String sFirstString = "I am ";
    String sSecondString = "Ruiyuan Li";
    String sThirdString = "I am Ruiyuan Li";
    
    // test1:comparation using "=="
    System.out.println("Test1: string comparation using \"==\"");
    String sJoinedString = sFirstString + sSecondString;
    System.out.println("sJoinedString = sFirstString + sSecondString");
    System.out.println("sJoinedString is:" + sJoinedString);
    System.out.println("sThirdString is: " + sThirdString);
    if (sJoinedString == sThirdString){
      System.out.println("sJoinedString == sThirdString is true, so the sJoinedString reference equaled to the sThirdString reference");
    }else{
      System.out.println("sJoinedString == sThirdString is false, so the sJoinedString reference did not equaled to the sThirdString reference");
    }
    
    System.out.println();
    sJoinedString = sThirdString;
    System.out.println("sJoinedString = sThirdString");
    System.out.println("sJoinedString is:" + sJoinedString);
    System.out.println("sThirdString is: " + sThirdString);
    if (sJoinedString == sThirdString){
      System.out.println("sJoinedString == sThirdString is true, so the sJoinedString reference equaled to the sThirdString reference");
    }else{
      System.out.println("sJoinedString == sThirdString is false, so the sJoinedString reference did not equaled to the sThirdString reference");
    }
    
    // test2:comparation using sVariableName.equals(sVariableName)
    System.out.println();
    System.out.println();
    System.out.println("Test2: string comparation using sVariableName.equals(sVariableName) method");
    sJoinedString = sFirstString + sSecondString;
    System.out.println("sJoinedString = sFirstString + sSecondString");
    System.out.println("sJoinedString is:" + sJoinedString);
    System.out.println("sThirdString is: " + sThirdString);
    if (sJoinedString == sThirdString){
      System.out.println("sJoinedString == sThirdString is true, so the sJoinedString reference equaled to the sThirdString reference");
    }else{
      System.out.println("sJoinedString == sThirdString is false, so the sJoinedString reference did not equaled to the sThirdString reference");
    }
    
    if (sJoinedString.equals(sThirdString)){
      System.out.println("But sJoinedString.equals(sThirdString) is true, so the sJoinedString refered object equaled to the sThirdString refered object");
    }else{
      System.out.println("But sJoinedString.equals(sThirdString) is false, so the sJoinedString refered object did not equaled to the sThirdString refered object");
    }

    // test3:comparation using sVariableName.equals(sVariableName)
    System.out.println();
    System.out.println();
    System.out.println("Test3: string comparation using sVariableName.intern() method");
    sJoinedString = sFirstString + sSecondString;
    sJoinedString = sJoinedString.intern();
    System.out.println("sJoinedString = sFirstString + sSecondString");
    System.out.println("sJoinedString is:" + sJoinedString);
    System.out.println("sThirdString is: " + sThirdString);
    if (sJoinedString == sThirdString){
      System.out.println("sJoinedString == sThirdString is true, so the sJoinedString reference equaled to the sThirdString reference");
    }else{
      System.out.println("sJoinedString == sThirdString is false, so the sJoinedString reference did not equaled to the sThirdString reference");
    }
    
    if (sJoinedString.equals(sThirdString)){
      System.out.println("But sJoinedString.equals(sThirdString) is true, so the sJoinedString refered object equaled to the sThirdString refered object");
    }else{
      System.out.println("But sJoinedString.equals(sThirdString) is false, so the sJoinedString refered object did not equaled to the sThirdString refered object");
    }
  }
}
