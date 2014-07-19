import static java.lang.Integer.*;
public class BitwiseOps {
  public static void main (String[] args){
    int iIndicatorAnd = 0b1111_1111_0000_0111;
    int iMask = 0b0000_0000_0000_0100; //mask code
    
    System.out.println("iIndicatorAnd   is:" + toBinaryString(iIndicatorAnd));
    System.out.println("iMask           is:" + toBinaryString(iMask));
    System.out.println("Get the third bits:" + toBinaryString(iIndicatorAnd & iMask));
    
    int iIndicatorOr = 0b1111_1111_0000_1001;

    System.out.println("iMask complement    is:" + toBinaryString(~iMask));
    System.out.println("iIndicatorOr        is:" + toBinaryString(iIndicatorOr));
    System.out.println("iMask               is:" + toBinaryString(iMask));
    iIndicatorOr |= iMask;
    System.out.println("Set the third bit to 1:" + toBinaryString(iIndicatorOr));

    iIndicatorOr &= ~iMask;
    System.out.println("and set it to 0  again:" + toBinaryString(iIndicatorOr));
    
    System.out.println("^ operators can be used to exchange the value of two integer variable without third variable");
    System.out.println("iIndicatorAnd   is:" + toBinaryString(iIndicatorAnd));
    System.out.println("iIndicatorOr    is:" + toBinaryString(iIndicatorOr));
    
    iIndicatorAnd ^= iIndicatorOr;
    System.out.println("After iIndicatorAnd ^= iIndicatorOr");
    System.out.println("iIndicatorAnd   is:" + toBinaryString(iIndicatorAnd));

    iIndicatorOr  ^= iIndicatorAnd;
    System.out.println("After iIndicatorOr  ^= iIndicatorAnd");
    System.out.println("iIndicatorOr    is:" + toBinaryString(iIndicatorOr));

    iIndicatorAnd ^= iIndicatorOr;
    System.out.println("After iIndicatorAnd ^= iIndicatorOr");
    System.out.println("iIndicatorAnd   is:" + toBinaryString(iIndicatorAnd));

    System.out.println("iIndicatorAnd   is:" + toBinaryString(iIndicatorAnd));
    System.out.println("iIndicatorOr    is:" + toBinaryString(iIndicatorOr));
    
    int fT = 10;
    byte bT = (byte) fT;
    byte bT1 = -1; // This will be ok
    System.out.println("byte  type bT  = " + bT);
    System.out.println("byte  type bT1 = " + toBinaryString(bT1));
    System.out.println("float type fT  = " + fT);
    
    System.out.println("Ok,test finished bit operation");
  }
}
