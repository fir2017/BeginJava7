public class TryFormattedInput{
  public static void main(String[] args){
    FormattedInput f = new FormattedInput();
    try{
     /*
      System.out.println("Please Enter an integer, a double, a string and a word:");
      System.out.println("read Integer:" + f.readInt());
      System.out.println("read double:" + f.readDouble());
      System.out.println("read string:" + f.readStr());
      System.out.println("read a word:" + f.readStr());
     */ 
      System.out.println("now reading the whole characters, please input the characters");
      f.resetToken();
      System.out.println("The input is:" + f.readAllCh());
      System.out.println("End of the reading");
    }catch(InvalidUserInputException e){
      e.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
