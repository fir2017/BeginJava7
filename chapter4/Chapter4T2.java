public class Chapter4T2 {
  public static void main (String[] args) {
    int[][] iaMultipleTable;
    iaMultipleTable = new int[12][];
    for (int i=0; i < iaMultipleTable.length; i++) {
      iaMultipleTable[i] = new int[i+1];
      for (int j=0; j < iaMultipleTable[i].length; j++) {
        iaMultipleTable[i][j] = (i+1) * (j+1);
      }
    }
    System.out.print("\t");
    for (int i = 1; i < 12; i++){
      if (i < 10 ) {
        System.out.print("  " + i  + "\t");
      } else {
        System.out.print(" " + i + "\t");
      }
    }
    System.out.println();
    for (int i = 0; i < iaMultipleTable.length; i++) {
      if (i < 9 ){
        System.out.print(" " + (i + 1) + "\t");
      }else{
        System.out.print(i + 1 + "\t");
      }
      for (int j = 0; j < iaMultipleTable[i].length; j++){
        if ( iaMultipleTable[i][j] < 10 ){
          System.out.print("  " + iaMultipleTable[i][j] + "\t");
        } else if ( iaMultipleTable[i][j] < 100 ){
          System.out.print(" " + iaMultipleTable[i][j] + "\t");
        }else{
          System.out.print(iaMultipleTable[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }
}
