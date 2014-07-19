import static java.lang.Math.*;
import static java.lang.Character.*;
public class LetterCheck3 {
  public static void main(String[] args) {
    char cLetter = 'A';
    cLetter = (char)(random() * 128 + 1);
    System.out.print("The random letter \'" + cLetter + "\' with code " + (byte)cLetter + " is ");
    if (isWhitespace(cLetter)){
      System.out.println("a white space!");
    }else if(isDigit(cLetter)){
      System.out.println("a digit number!");
    }else if(isUpperCase(cLetter)){
      System.out.println("a capital letter!");
    }else if(isLowerCase(cLetter)){
      System.out.println("a low letter!");
    }else{
      System.out.println("other symbol!");
    }
  }
}
