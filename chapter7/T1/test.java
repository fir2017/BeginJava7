public class test{
  public static void main(String[] args) {
    int[] t = null;
    for (int i=0; i < t.length; i++) {
       t[i] = i;
    }
    try{
      System.out.println(t[-1]);
    }catch(Exception e) {
      System.out.println("In caught block!");
      System.out.println(e.getMessage());
    }
  }
}
