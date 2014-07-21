public class StringTokening {
  public static void main (String[] args) {
    String sText = "To be or not to be,,,, that is the question";
    String sDelimiters = "[,. ]+";
    int[] iaLimits = {0,-1};
    
    for (int iLimit : iaLimits) {
      System.out.println("Using limit:" + iLimit);
      String[] saTokens = sText.split(sDelimiters,iLimit);
      for (String sToken : saTokens){
        System.out.println(sToken + "::::");
      }
      System.out.println();
    }
  }
}
// 痛苦是的，很痛苦啊
