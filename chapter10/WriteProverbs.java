import java.nio.*;
import java.nio.file.*;
import java.util.EnumSet;
import java.nio.channels.*;
import java.io.IOException;
import static java.nio.file.StandardOpenOption.*;

public class WriteProverbs {
  public static void main (String[] args) {
    if(args.length <= 0) {
      System.err.println("Error: File name required!");
      return;
    }
    
    Path fp = Paths.get(args[0]);
    fp = fp.toAbsolutePath();
    
    String[] proverbs = {
                          "Indecision maximizes fl exibility.",
                          "Only the mediocre are always at their best.",
                          "A little knowledge is a dangerous thing.",
                          "Many a mickle makes a muckle.",
                          "Who begins too much achieves little.",
                          "Who knows most says least.",
                          "A wise man sits on the hole in his carpet."
                        };
    try(WritableByteChannel fw = Files.newByteChannel(fp, CREATE, WRITE)) {
      int maxLen = 0;
      for(String s:proverbs){
        if(s.length() > maxLen) maxLen = s.length();
      }
      ByteBuffer buf = ByteBuffer.allocate(2 * maxLen + 4); 
      for(String s:proverbs) {
        buf.putInt(s.length()).asCharBuffer().put(s);
        buf.position(buf.position() + 2 * s.length()).flip();
        buf.flip();
        fw.write(buf);
        buf.clear();
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
