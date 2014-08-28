public class T1 {
  public static getValue(int[] a, index) throws N2IException{
    try{
      return a[index];
    }catch(NullPointerException e){
      throw new N2IException(e);
    }catch(ArrayIndexOutOfBoundsException e){
      throw new N2IException(index,a.length,e);
    }
  }
  public static void main(String[] args) {
    try {
      
    }catch(N2IException e) {

    }
  }
}
