import static java.lang.Math.random;
public class T3{
  public static int iterationValue(int numOfIteration) throws ArithmeticLoopException  {
    int tmp = (int)(random() * 10);
    int i = 0;
    try{
      System.out.println("Enter into Try block in iterationValue()!");
      for (; i < numOfIteration; i++) {
        tmp /= (int)(random()*10); 
      }
      System.out.println("Leave of Try block in iterationValue()!"); 
    }catch(ArithmeticException e){
      System.out.println("Enter into catch block in iterationValue()!");
      System.out.println("Throw ArithmeticLoopException()!"); 
      throw new ArithmeticLoopException("Iteration exception!",e);
    }finally{
      System.out.println("Enter into finally block in iterationValue()!");
      System.out.println("whith iteration number = " + i);
      System.out.println("Leave finally block in interationValue()!");
    }
    
    System.out.println("Leave of Try structure in iterationValue!");
    return tmp;
  }
  
  public static void main (String[] args) {
    for (int i = 1; i < 20; i++){
      try{
        System.out.println("Enter into try block in main() with i = " + i);
        System.out.println("The result of " + i + " iteration: " + iterationValue(i));  
        System.out.println("Leaver of try block in main()!");
      }catch(ArithmeticLoopException e){
        System.out.println("Enter into the catch block in main()!");
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.out.println("Leave of catch block in man()!");
      }
      System.out.println("After try struct in main()!");
      System.out.println();
    }
  }
}
