import static java.lang.Math.*;
public class LetterCheck {
  public static void main(String[] args){
    char cLetter = 'A';
    cLetter = (char)(1 + random() * 128);

    System.out.println("The random letter \'" + cLetter + "\' with code " + (byte)cLetter + " is ");
    if (cLetter >= 'A' ) {
      if (cLetter <= 'Z') {
        System.out.println("capital");
      }else{
        if (cLetter >= 'a' ) {
          if (cLetter <= 'z') 
            System.out.println("samll");
          else
            System.out.println(" not a letter");
        }else{
          System.out.println(" not a letter");
        }
      }
    }else{
      System.out.println(" not a letter");
    }
  }
}
