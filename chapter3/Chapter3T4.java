import static java.lang.Math.*;
public class Chapter3T4 {
  enum Vowel {a,e,i,o,u}
  public static void main (String[] args){
    int iNumLetters = 0;
    iNumLetters = (int)(random()*10 + 1);
    System.out.println("Number of Letters:" + iNumLetters);
    int i=1;
    LabelVowel:
    while (i<=iNumLetters) {
      char cLetter = (char)(random()*26 + 65);
      switch (cLetter) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          break;
        default:
          i++;
          System.out.print(cLetter); 
      }
    } 
    System.out.println();
  }
}
