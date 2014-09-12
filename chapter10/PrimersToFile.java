import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.IOException;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;
import static java.lang.Math.min;
import static java.nio.file.StandardOpenOption.*;

public class PrimersToFile { 
  public static void main(String[] args) {
    if(args.length <= 0){
      System.err.println("Error: file and number of Primers generation required!"); 
      System.err.println("Usage: java PrimersToFile file 100[number of primers will be generated]!");
      return;
    } 
    
    int numPrimers = 100;
    if(args.length == 1){
      System.err.println("Warning: the number of primers required generated is not setting: set to " + numPrimers);
    }else{
      try{
        numPrimers = Integer.valueOf(args[1]).intValue();
      }catch(Exception e){
        e.printStackTrace();
        System.err.println("Warning: the value '" + args[1] + "' is not a valide integer!");
        numPrimers = 100;
        System.err.println("number of primers set to: " + numPrimers);
      }
    }
    
    Path fp = Paths.get(args[0]);
    fp = fp.toAbsolutePath();
    System.err.printf("file:%s, number of primers: %d%n",fp, numPrimers); 
    
    long[] primers = getPrimers(numPrimers);
    for(long p : primers) {
      System.out.println(p);
    }
    
  }
  
  public static long[] getPrimers(int numPrimers) {
    long[] primers = new long[numPrimers];
    
    if(numPrimers == 1){
      primers[0] = 2L;
      return primers;
    }
 
    primers[0] = 2L;
    primers[1] = 3L;
    
    for(int i = 2; i < numPrimers; i++) {
      long nextPrimer = primers[i-1];  
      outer:
      while(true){
        nextPrimer += 2;
        long limit = (long)(ceil(sqrt((double)nextPrimer)));
        for(int j = 0; j < i && primers[j] <= limit; j++){
          if (nextPrimer % primers[j] == 0) continue outer; 
        }
        primers[i] = nextPrimer;
        break;
      }
    }
    return primers;
  }
  
}
