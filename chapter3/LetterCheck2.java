import static java.lang.Math.*;
// letter check use logical operator
public class LetterCheck2 {
  public static void main(String[] args){
    char cLetter = 'A';
    cLetter = (char)(random() * 128 + 1); 
    System.out.print("The random letter \'" + cLetter + "\' with code " + (byte)cLetter + " is ");
    if ( cLetter >= 'A' && cLetter <= 'Z' ) {
      System.out.println("a capital letter!");
    }else if( cLetter >= 'a' && cLetter <= 'z' ) {
      System.out.println("a low letter!");
    }else{
      System.out.println("not a letter!");
    }
    
/*  when compile, the follow code will raise error!
    if (true && cLetter){
*      System.out.println("ok test for && in boolean and non boolean operaters!");
*    }
*/
  }
}
