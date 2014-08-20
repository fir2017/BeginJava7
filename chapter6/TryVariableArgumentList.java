public class TryVariableArgumentList {
  public static void main (String[] args){
    printAllArg(1,2,true,"boikdf",19868.6);
    printAllArg();
    printAllArg(1,"fjdaf",'c',false);
  }
  public static void printAllArg (Object ... args){
    for(Object o : args){
      System.out.println(o);
    }
  }
}
