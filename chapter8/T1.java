import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.io.IOException; 
public class T1 {
  static StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
  static {
    tokenizer.whitespaceChars(',',',');
  }
  public static void main (String[] args) {
    System.out.println("please enter data items");
    try{
      int type;
      while((type = tokenizer.nextToken()) != tokenizer.TT_EOF){
        if(type == tokenizer.TT_NUMBER){
          System.out.println(tokenizer.nval);
        }else if(type == tokenizer.TT_WORD){
          System.out.println(tokenizer.sval);
        }else{
          System.out.println("Unkow type:" + type);
        }
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
