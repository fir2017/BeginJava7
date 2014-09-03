import java.nio.file.*;
import java.io.*;
import java.nio.*; 
public class StreamOutputToFile {
  public static void main (String[] args) {
    Path dest = Paths.get(System.getProperty("user.dir"));
    dest = dest.resolve("fibonacci1");
    System.out.println(dest);
    int index = 0;
    try(BufferedOutputStream outLong = new BufferedOutputStream(Files.newOutputStream(dest))){
      long[] f = {0,0};
      ByteBuffer buf = ByteBuffer.allocate(50 * 8);
      for (int i = 0; i < 50; i++){
        if( i < 2){
          f[index] = i; 
        }else{
          f[index] = f[0] + f[1];
        }
        //outLong.write(f[index]);
        buf.putLong(f[index]);
        index = ++index % 2;
      }
      outLong.write(buf.array());
    }catch(IOException e){
      e.printStackTrace();
    }
  }
} 
