public class TryChainedExceptions {
  public static int divide (int[] array, int index) throws ZeroDivideException {
    try {
      System.out.println("Try block in divide method!");
      array[index] = array[index + 2]/array[index + 1];
      System.out.println("Out Try block in divide method!");
      return array[index];
    }catch(ArithmeticException e) {
      System.out.println("Arithmetic exception caughted in divide()!");
      System.out.println("Throwing ZeroDivideException in divide()!");
      throw new ZeroDivideException(index + 1,e);
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException in divide()!");
    }
    System.out.println("After Try structure in divide()!");
    return array[index];
  }
  public static void main(String[] args) {
    int[] x = {10, 5, 0, 3, 12, 0, 6};
    System.out.println("The values of array X:");
    for(int v:x){
      System.out.print(v + " ");
    }
    System.out.println();
    for (int i = 0; i < x.length; i++){
      try{
        System.out.println("First try block in main()!");
        System.out.println("Result = " + divide(x,i));
      }catch (ZeroDivideException e){
        System.out.println("Caughted ZeroDivideException in Main()!");
        System.out.println(e.getMessage());
        int index = e.getIndex();
        if (index > 0) {
          x[index] = 1;
          x[index + 1] = x[index - 1];
          e.printStackTrace();
          System.out.println("Zero divitor at x[" + index + "] corrected to 1");
        }
      }catch (ArithmeticException e){
        System.out.println("Caught ArithmeticException in main()!");
      }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught ArrayIndexOutOfBoundsException in main()!");
      }
      System.out.println("Out of Try structuer in main()!");
    }
    System.out.println("the value of x after calculate:");
    for (int v:x) {
      System.out.print(v + " ");
    }
    System.out.println();
  }
}
