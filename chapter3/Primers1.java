public class Primers1 {
  public static void main(String[] args){
    int iNumValues = 50;
    boolean bIsPrimer = true;
    for( int i=2; i < iNumValues; i++) {
      bIsPrimer = true;
      for (int j =2; j<i;j++){
        if (i % j ==0){
          bIsPrimer = false;
          break;
        }
      } 
      if (bIsPrimer) {
        System.out.println(i);
      }
    }
  }
}
