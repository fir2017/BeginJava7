import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class ReaderInputFromFile {
  public static void main(String[] args) {
    if(args.length == 0){
      System.err.println("Error: required input file!");
      System.exit(1);
    }
    
    Path fop = Paths.get(args[0]);
    try(BufferedReader fo = Files.newBufferedReader(fop,Charset.forName("UTF-8"))){
      String txt = null;
      while( (txt = fo.readLine()) != null){
        System.out.println(txt);
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
} 
