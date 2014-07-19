import static java.lang.Long.*;
public class BitOpFunction {
  public static void main(String[] args) {
    long lNum = 0xF000_0000_0000_000FL;
    System.out.println("The origin number is:\n" + toBinaryString(lNum));
    lNum = rotateLeft(lNum,2);
    System.out.println("rotate left 2 bits:\n" + toBinaryString(lNum));
    lNum = rotateRight(lNum,3);
    System.out.println("Rotate right 3 bits:\n" + toBinaryString(lNum));
    lNum = reverse(lNum);
    System.out.println("Reverse the bits:\n" + toBinaryString(lNum));
    System.out.println("Number of 1s in:" + bitCount(lNum));
  }
}
