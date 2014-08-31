import static java.lang.Math.random;
public class T3{
  public static void main (String[] args) {
    int numIteration = 20;
    for (int i = 0; i < numIteration; i++){
      System.out.printf("%2d)%+7.2f  ",i + 1,random() * 100 -50); 
      if ((i+1) % 5 == 0) System.out.println();
    }
  }
}
