public class ExtractSubstrings {
  public static void main (String[] args) {
    String sText = "To   be or not to be, this is a question!";
    
    int iWords = 0;
    int iFromPos = 0;
    sText = sText.trim();
    int iIndex = sText.indexOf(' ',iFromPos);
    while (iIndex > 0){
      if (iIndex > iFromPos) {
        System.out.println(iFromPos + " to " + (iIndex - 1) + ":" + sText.substring(iFromPos,iIndex));
        iWords++;
      }
      iFromPos = iIndex + 1;
      iIndex = sText.indexOf(' ',iFromPos);    
    }
    if (sText.length() > (iFromPos + 1))  
      System.out.println(iFromPos + " to " + (sText.length() - 1) + ":" + sText.substring(iFromPos));
  }
}
