import static java.lang.Long.toHexString;
public class packCharacters {
  public static void main (String[] args){
    char cA = 'A';
    char cB = 'B';
    char cC = 'C';
    char cD = 'D';
    
    System.out.println("The packed 4 characters:"); 
    System.out.println(cA + ":" + toHexString(cA));
    System.out.println(cB + ":" + toHexString(cB));
    System.out.println(cC + ":" + toHexString(cC));
    System.out.println(cD + ":" + toHexString(cD));
    
    long lPacked = pack4Characters(cA,cB,cC,cD);
    System.out.println("The packaged result is:" + toHexString(lPacked));
    //System.out.println("The packaged result is:" + lPacked);
    long lMask = 0XFF;
    //char cLetter = (char) (lPacked & lMask);
    char cLetter = (char) ((byte) lPacked) ;
    System.out.println("unpacked cD is:" + cLetter);
    lPacked >>= 8;
    cLetter = (char) ((byte) lPacked );
    //cLetter = (char) (lPacked & lMask);
    System.out.println("unpacked cD is:" + cLetter);
    lPacked >>= 8;
    cLetter = (char) ((byte) lPacked) ;
    //cLetter = (char) (lPacked & lMask);
    System.out.println("unpacked cD is:" + cLetter);
    lPacked >>= 8;
    cLetter = (char) ((byte) lPacked) ;
    //cLetter = (char) (lPacked & lMask);
    System.out.println("unpacked cD is:" + cLetter);
  }
  
  private static long pack4Characters ( char cA, char cB,char cC,char cD ) {
    long lPacked = 0;
    lPacked = (lPacked << 8) | cA;
    lPacked = (lPacked << 8) | cB;
    lPacked = (lPacked << 8) | cC;
    lPacked = (lPacked << 8) | cD;
    return (lPacked);
  }
}
