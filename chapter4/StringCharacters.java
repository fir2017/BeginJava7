public class StringCharacters {
  public static void main (String[] args) {
    String sText = "To be or not to be, that is the question;"
                 + "Whether ‘tis nobler in the mind to suffer"
                 + " the slings and arrows of outrageous fortune,"
                 + " or to take arms against a sea of troubles,"
                 + " and by opposing end them?";
    int iVovels = 0;
    int iSpaces = 0;
    int iLetters = 0;
    
    sText = sText.toLowerCase();
    for (int i=0; i<sText.length(); i++){
      char cALetter = sText.charAt(i);
      if (Character.isWhitespace(cALetter)) {
        iSpaces++;
      } 
      
      if ('a' == cALetter | 'e' == cALetter | 'i' == cALetter | 'o' == cALetter | 'u' == cALetter) {
        iVovels++;
      } 
      if (Character.isLetter(cALetter)) {
        iLetters++;
      } 
    }
    System.out.println("The text contained vovels:" + iVovels + ", Whitespace:" + iSpaces + ", Letters:" + iLetters );
  }
}
