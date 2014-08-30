import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.IOException;

public class FormattedInput {
  public void resetToken(){
    tokenizer.resetSyntax();
    bSyntax = true;
  }
  
  public String readAllCh() throws InvalidUserInputException{
    if(bSyntax){
      StringBuffer s = new StringBuffer(""); 
      int type;
      while((type = readToken()) != tokenizer.TT_EOL){
        s.append((char)type);
      }
      return s.toString();
    }else{
      throw new InvalidUserInputException("The resetSyntax is not set!");
    } 
  }

  public double readDouble() throws InvalidUserInputException{
    int type = readToken();
    if(type == tokenizer.TT_NUMBER){
      return tokenizer.nval;
    }else if(type == tokenizer.TT_WORD){
      throw new InvalidUserInputException("It is a Word token[not double]: " + tokenizer.sval, "" + tokenizer.sval);
    }else{
      throw new InvalidUserInputException("It in the end of Stream");
    }
  }

  public String readStr() throws InvalidUserInputException{
    int type = readToken();
    if(type == tokenizer.TT_WORD || type == '\'' || type == '\"'){
      return tokenizer.sval;
    }else if(type == tokenizer.TT_NUMBER){
      throw new InvalidUserInputException("It is a Number token[not String]: " + tokenizer.nval, "" + tokenizer.nval);
    }else if(type == tokenizer.TT_EOF){
      throw new InvalidUserInputException("It in the end of Stream");
    }else{
      throw new InvalidUserInputException("Unknown input error");
    }
  }

  public int readInt() throws InvalidUserInputException{
    int type = readToken();
    if(type == StreamTokenizer.TT_NUMBER){
      if(tokenizer.nval != (int)tokenizer.nval){
        throw new InvalidUserInputException("It is a double token[not integer]:" + tokenizer.nval, "" + tokenizer.nval);
      } 
      return (int)tokenizer.nval;
    }else{
      if(type == StreamTokenizer.TT_WORD){
        throw new InvalidUserInputException("It is a Word token[not number]:" + tokenizer.sval, tokenizer.sval);
      }else{
        throw new InvalidUserInputException("It in the end of Stream");
      }
    } 
  }

  private int readToken(){
    int ttype = 0;
    try{
      if((ttype = tokenizer.nextToken()) == StreamTokenizer.TT_EOF){
        System.out.println("In the End of Stream!");
      }
    }catch(IOException e){
      e.printStackTrace();   
      System.exit(1);
    }
    return ttype;
  }
  private StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader (new InputStreamReader(System.in)));
  private boolean bSyntax = false; 
  //private int ttype;
} 
