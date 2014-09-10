import java.nio.*;
import java.nio.file.*;
import java.util.EnumSet;
import java.nio.channels.*;
import java.io.IOException;
import static java.nio.file.StandardOpenOption.*;

public class BufferStateTrace {
  public static void main(String[] args) {
    if(args.length <= 0) {
      System.out.println("Error: File name required!");
      return;
    }
    String txt = "Garbage in, Garbage out.";
    Path fp = Paths.get(args[0]); 
    fp = fp.toAbsolutePath();
    try(WritableByteChannel fw = Files.newByteChannel(fp, WRITE, CREATE)){
      ByteBuffer buf = ByteBuffer.allocate(1024);
      System.out.printf("New Buffer: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      for(char ch : txt.toCharArray()){
        buf.putChar(ch);
      }
      System.out.printf("Buffer After Load: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      buf.flip();
      System.out.printf("Buffer flip: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      fw.write(buf);
      System.out.printf("Buffer after write: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      buf.flip();
      System.out.printf("Buffer flip again: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      fw.write(buf);
      System.out.printf("Buffer after write second: Position=%1$4d	Limit=%2$4d	Capacity=%3$4d	FileSize=%4$4d%n", buf.position(),buf.limit(),buf.capacity(),((FileChannel)fw).size());
      System.out.println("Buffer write two times!");
    }catch(Exception e) {
      e.printStackTrace();
    }
  }
} 
