import java.nio.*;
import java.nio.file.*;
import java.io.IOException;
import java.nio.channels.*;
import java.util.EnumSet;
import static java.nio.file.StandardOpenOption.*;
public class TryChannel {
  public  static void main(String[] args) {
    if(args.length <= 0) {
      System.err.println("Error: file name quired!");
      return;
    }
    String[] sayings = {
                      "The more you plan the luckier you get.",
                      "The time to complete a project is the time " +
                      "one person would need to complete it " +
                      "multiplied by the number of people on the project.",
                      "If at fi rst you don’t succeed, remove any evidence that you tried.",
                      "A clever person solves problems, a wise person avoids them.",
                      "Death is nature’s way of telling you to slow down.",
                      "A hen is an egg’s way of making other eggs.",
                      "The earlier you begin coding the later you fi nish.",
                      "Anything you can’t understand is intuitively obvious."
                     };
    
    Path fileOut = Paths.get(args[0]); 
    fileOut = fileOut.toAbsolutePath();
    System.out.println(fileOut);
    String sep = System.lineSeparator();
    try(WritableByteChannel wf = Files.newByteChannel(fileOut,WRITE,CREATE)){
      ByteBuffer buf = null;
      for(String s:sayings) {
        buf = ByteBuffer.wrap((s + sep).getBytes()); 
        wf.write(buf);
      }
      System.err.println("Finished writing!");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
