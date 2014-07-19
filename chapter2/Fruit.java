import java.io.IOException;
public class Fruit {
  public static void main (String[] args){
  //public static void main (){: will raise "can not find main fucntion" error when excuting but no in assembly.
    int iNumOranges = 5;
    int iNumApples = 10;
    int iNumFruits = 0;
    
    iNumFruits = iNumOranges + iNumApples;
    System.out.println("Number of Oranges:" + iNumOranges + ";Number of Apples:" + iNumApples);
    System.out.println("Total Number of Fruits:" + iNumFruits);
    System.out.println("Press Enter to exit");
    try {
      System.in.read();
    } catch(IOException e) {
      System.out.println("There are some error:");
      return; 
    }
  }
}
