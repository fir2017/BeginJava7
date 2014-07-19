import static java.lang.Math.*;
public class RandomNumSet {
  public static void main (String[] args){
    int[] iSelectedNum;
    int iNumOfRolls = 5;
    for (int i=1; i < iNumOfRolls; i++){
      int iCount = 0;
      iSelectedNum = new int [6];
      LabelDo:
      do {
        int iOneRandom = (int)(random()*49 + 1);
	for (int j = 0; j < iCount; j++){
          if (iOneRandom == iSelectedNum[j]) {
            System.out.println(iOneRandom + " is identity to:" + j);
            continue LabelDo;
          } 
	}
        iSelectedNum[iCount++] = iOneRandom; 
      }while (iCount < iSelectedNum.length);
      for (int iNum:iSelectedNum){
        System.out.println(iNum);
      } 
      System.out.println();
    }
    String sT;
  }
}
