import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class T2 {
  public static void main(String[] args) {
    if(args.length <= 0){
      System.err.println("Usage: java T2 directory extention!");
      System.err.println("Error: Required directory! Please assign the directory in commad!");
      return;
    }
    Path dir = Paths.get(args[0]);
    if(Files.isRegularFile(dir) || Files.isSymbolicLink(dir)){
      System.out.println("The path:" + dir + ": is file or SymbolicLink!");
      return;
    }else if (Files.isDirectory(dir)) {
      try{
        System.err.println("Files in: " + dir);
        DirectoryStream <Path> files = args.length < 2 ? Files.newDirectoryStream(dir) : Files.newDirectoryStream(dir,"*." + args[1]);
        for(Path f : files) {
          if(Files.isRegularFile(f) || Files.isSymbolicLink(f)){
            System.err.println("\t" + f);
          }
        }    
      }catch(IOException e) {
        e.printStackTrace();
      }
    } 
  }
  public static boolean isDirectory(Path path) {
    try{
      BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
      return true;
    }catch(IOException e){
      e.printStackTrace();
      return false;
    }
  }
}
