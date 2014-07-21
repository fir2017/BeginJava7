public class FindCharacters {
  public static void main (String[] args) {
    String sText = "To be or not to be, that is the question;"
                 + "Whether ‘tis nobler in the mind to suffer"
                 + " the slings and arrows of outrageous fortune,"
                 + " or to take arms against a sea of troubles,"
                 + " and by opposing end them?";
    String sToFindAnd = "and";
    String sToFindThe = "the";
    int iAnds = 0;
    int iThes = 0;
    
    int iIndex = 0;
    sText = sText.toLowerCase();
    do {
      iIndex = sText.indexOf(sToFindAnd,iIndex);
      if (iIndex >= 0) {
        iIndex += sToFindAnd.length();
        iAnds++;
      }
    } while (iIndex < sText.length() && iIndex >= 0);
  
    iIndex = sText.length();
    do {
      iIndex = sText.lastIndexOf(sToFindThe,iIndex);
      if (iIndex >= 0){
        iThes++;
        iIndex -= sToFindThe.length();
      }
    } while (iIndex > 0);
    System.out.println("Number of \'and\':" + iAnds);
    System.out.println("Number of \'the\':" + iThes);
  }
}
