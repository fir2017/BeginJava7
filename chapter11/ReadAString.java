import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadAString {
  public static void main(String[] args) {
    if(args.length == 0){
      System.err.println("Error: file name to read required!");
      System.exit(1);
    }
    Path fop = Paths.get(args[0]);
    try(ReadableByteChannel fo = Files.newByteChannel(fop)){
      System.out.println("The size of file:" + fop + ": is " + ((SeekableByteChannel)fo).size());
      ByteBuffer buf = ByteBuffer.allocate(1024);
      StringBuffer str = new StringBuffer();
      while(fo.read(buf) != -1){
        buf.flip();
        while(buf.hasRemaining()){
          str.append(buf.getChar()); 
        }
        System.out.println(((ByteBuffer)(buf.flip())).asCharBuffer().toString());
        buf.clear();
      }
      System.out.println(str.toString());
    }catch(Exception e){
      e.printStackTrace();
    } 
  }
} 
