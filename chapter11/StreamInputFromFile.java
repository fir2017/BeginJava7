import java.nio.file.*;
import java.nio.*;
import java.io.IOException;
import java.io.*;

public class StreamInputFromFile {
  public static void main (String[] args){
    if(args.length < 1){
      System.err.println("Error: Input file name required!");
      System.exit(1);
    }
    Path fop = Paths.get(args[0]);
    
    try(BufferedInputStream fo = new BufferedInputStream(Files.newInputStream(fop))){
      ByteBuffer buf = ByteBuffer.allocate(6*8);
      LongBuffer lbuf = buf.asLongBuffer();
      byte[] byt = buf.array(); 
      boolean markit = true;
      while(true){
        if(markit) fo.mark(fo.available());
        System.out.println("aviable:" + fo.available());
        int numRead = fo.read(byt, 0, byt.length);
        if(numRead == -1) break;
        for(int i =0; i < numRead/8; i++){
          System.out.printf("%12d", lbuf.get());
        } 
        System.out.println();
        lbuf.flip();
        if(markit)fo.reset();
        markit = !markit;
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
