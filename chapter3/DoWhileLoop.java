public class DoWhileLoop {
  public static void main(String[] args) {
    long lSum = 0;
    int iIndex = 0;
    do {
      lSum += iIndex;
      iIndex++;
    }while(iIndex <= 100);
    System.out.println("Sum of 0 to 100:" + lSum);
  }
}
