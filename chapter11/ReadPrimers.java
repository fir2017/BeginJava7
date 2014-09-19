import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.*;

public class ReadPrimers {
  public static void main(String[] args) {
    if(args.length == 0){
      System.err.println("Error: input file required!");
      System.exit(1);
    }
    Path fop = Paths.get(args[0]);
    try(ReadableByteChannel fo = Files.newByteChannel(fop)){
      ByteBuffer buf = ByteBuffer.allocate(8*6);
      long[] primers = new long[6];
      while(fo.read(buf) != -1){
        LongBuffer lbuf = ((ByteBuffer)buf.flip()).asLongBuffer();
        int reads = lbuf.remaining();
        lbuf.get(primers,0,reads);
        for(int i=0; i < reads; i++){
          System.out.printf("%12d",primers[i]);
        }
        System.out.println();
      }
      System.out.println("Read all primers!");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
