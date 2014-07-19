import static java.lang.Integer.*;
public class charCalc {
  public static void main (String[] args) {
    char letter1 = 'A';
    char letter2 = (char) (letter1 + 1);
    char letter3 = letter2;
    
    System.out.println("The three letters were :" + letter1 + letter2 + (++letter3));
    System.out.println("The three letters and its code are:\n" + letter1 + "," + (int)(letter1) +
                                                         ";" + letter2 + "," + (int)(letter2) +
                                                         ";" + letter3 + "," + (int)(letter3));
    System.out.println("And the hexdecimal for these three letters are:");
    System.out.println(letter1 + "," + toHexString(letter1) + ";" +
                       letter2 + "," + toHexString(letter2) + ";" +
                       letter3 + "," + toHexString(letter3));
    byte bT = (byte)(0XFF);
    System.out.println("asign 0XFF to byte type variable bT, bT =" + bT);
                                                               
  }
}
