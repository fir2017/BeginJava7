import static java.lang.Math.*;
public class MorePrimers {
  public static void main (String[] args) {
    int[] iaPrimers;
    int iIndex = 0;
    if (args.length > 0) {
      iaPrimers = new int[Integer.parseInt(args[0])];
    }else{
      iaPrimers = new int[50];
    }
    iaPrimers[0] = 2;
    iaPrimers[++iIndex] = 3;
    int iEstemateValue = 3;
    LabelWhileValue:
    while(iIndex < iaPrimers.length - 1){
      iEstemateValue += 2;
      int iUpper = (int)(ceil(sqrt(iEstemateValue)));
      for (int i=1; i < iIndex && iUpper >= iaPrimers[i]; i++){
        if (iEstemateValue % iaPrimers[i] == 0) continue LabelWhileValue;
      }
      iaPrimers[++iIndex] = iEstemateValue;
    }
    for(int iPrimer : iaPrimers){
      System.out.println(iPrimer);
    }
    long [] lTest = {1,2,3};
    for(long l : lTest) System.out.println(l);
  }
}
