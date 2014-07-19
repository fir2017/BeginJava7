public class BlockBreak {
  public static void main(String[] args) {
    long lInd = 0;
    FirstBlock: {
      System.out.println("In FirstBlock!");
      lInd++;
      for(int i=0;i<=10;i++) { break FirstBlock;}
      System.out.println("after break in FirstBlock!");
      lInd++;
    }
    System.out.println("out FirstBlock!");
    System.out.println("lInd is " + lInd); 
  }
}
