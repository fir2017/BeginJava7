public class WhileLoop {
  public static void main(String[] args){
    long lSum = 0;
    int iIndex = 0;
    while(iIndex <= 100 ){
      lSum += iIndex;
      iIndex++;
    }
    System.out.println("Sum of 0 to 100:" + lSum);
  }
}
