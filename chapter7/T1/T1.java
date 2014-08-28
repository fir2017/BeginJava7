public class T1 {
  public static int getValue(int[] a,int index) throws N2IExceptions{
    try{
      return a[index];
    }catch(NullPointerException e){
      throw new N2IExceptions(e);
    }catch(ArrayIndexOutOfBoundsException e){
      throw new N2IExceptions(index,a.length,e);
    }
  }
  public static void main(String[] args) {
    int[][] t = new int[3][];
    
    for (int i=0; i < t.length; i++){
      try {
        System.out.println("Enter into Try block in main(),i = " + i);
        switch(i){
          case 0:
            t[i] = null;
            break;
          case 1:
            t[i] = new int[3];
            t[i][0] = 1;
            t[i][1] = 2;
            t[i][2] = 3;
            break;
          case 2:
            try{
              t[i] = new int[-4];
            }catch(Exception e){
              throw new N2IExceptions(-4,e);
            }
            break;
        }
        System.out.println("Result = " + getValue(t[i],5));
      }catch(N2IExceptions e) {
        System.out.println("Enter into catch block in main()!");
        System.out.println(e.getMessage());
        e.printStackTrace();
      }
    }
  }
}
