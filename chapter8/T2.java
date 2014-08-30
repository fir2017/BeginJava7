import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.io.IOException;
public class T2 {
  private static StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
  static {
     tokenizer.whitespaceChars(0,9);
     tokenizer.whitespaceChars(11,47);
     tokenizer.whitespaceChars(58,64);
     tokenizer.whitespaceChars(91,96);
     tokenizer.whitespaceChars(123,126);
  }
  public static String[] getStrings(){
    try{
      int type = tokenizer.nextToken();
      StringBuffer s = new StringBuffer();
      while( type != tokenizer.TT_EOF && type != tokenizer.TT_EOL){
        if(type == tokenizer.TT_WORD){
          s.append(tokenizer.nval + ",");
        }else if(type == tokenizer.TT_NUMBER){
          s.append(tokenizer.sval + ",");
        }else{
          s.append(type + ",");
        }
        type = tokenizer.nextToken();
        System.out.println("type:" + type);
      }
      return s.toString().split(",");
    }catch(IOException e){
      e.printStackTrace();
      System.exit(1);
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println("please enter data items!");
    String[] s = getStrings();
    System.out.println(s.length);
  }
}
