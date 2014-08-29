import static java.lang.Math.random;
public class T3{
  public int iterationValue(int numOfIteration) throws ArithmeticLoopException  {
    int tmp = (int)(random() * 10);
    int i = 0;
    try{
      System.out.println("Enter int
      for (; i < numOfIteration; i++) {
        tmp /= (int)(random()*10); 
      }
    }catch(ArithmeticException e){
       
    }
    return tmp;
  }
}
