import static java.lang.Math.*;
public class NumberCheck {
  public static void main(String[] args){
    int iNumber = 0;
    iNumber = 1 + (int) (random() * 100 );
    if(iNumber % 2 == 0 ) 
      System.out.println("The random number \'" + iNumber + "\' is and even number");
    else
      System.out.println("The random number \'" + iNumber + "\' is and odd number");
  }
}
