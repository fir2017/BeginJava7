import java.nio.*;
import java.util.*;
import java.nio.file.*;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;

public class UsingAFormatter {
  public static void main (String[] args) {
    if(args.length <= 0 ){
      System.err.println("Error:file name required!");
      return;
    }
    Path fp = Paths.get(args[0]);
    fp = fp.toAbsolutePath();
    String sep = System.lineSeparator();
    
    String[] txt = { "Rome wasn't burned in a day.",
                     "It's a bold mouse that sits in the cat's ear.",
                     "An ounce of practice is worth a pound of instruction."
                   };
    System.err.println("New file is:" + fp);
    try(WritableByteChannel fw = Files.newByteChannel(fp, WRITE, CREATE)){
      ByteBuffer buf = ByteBuffer.allocate(1024);
      CharBuffer charBuf = buf.asCharBuffer();
      System.err.print("Char buff:");
      System.err.printf("Position=%4d, limit=%4d, capacity=%4d%n",charBuf.position(), charBuf.limit(), charBuf.capacity());
      Formatter formatter = new Formatter(charBuf);
      int i = 0;
      for(String s : txt) {
        i++;
        formatter.format("The proverb %2d: %s%s",i,s,sep); 
        System.err.print("Char buff loading:");
        System.err.printf("Position=%4d, limit=%4d, capacity=%4d%n",charBuf.position(), charBuf.limit(), charBuf.capacity());
        charBuf.flip();
        System.err.print("Char buff flip:");
        System.err.printf("Position=%4d, limit=%4d, capacity=%4d%n",charBuf.position(), charBuf.limit(), charBuf.capacity());
        
        System.err.print("Byte buff:");
        System.err.printf("Position=%4d, limit=%4d, capacity=%4d, remain=%4d%n",buf.position(), buf.limit(), buf.capacity(),buf.remaining());
        
        buf.limit(2*charBuf.length());
        System.err.print("Byte buff limit updation:");
        System.err.printf("Position=%4d, limit=%4d, capacity=%4d, remain=%4d%n",buf.position(), buf.limit(), buf.capacity(),buf.remaining());
        
        fw.write(buf);
        buf.clear(); 
        charBuf.clear();
      }
    }catch(Exception e) {
      e.printStackTrace();
    }
  }
}
