import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class T1 {
  public static void main (String[] args) {
    if(args.length <= 0) {
      System.err.println("List all the directoties in a given directory!");
      System.err.println("Error: Absent a directory, please given the path of a directory?");
      return;
    }
    Path dir = Paths.get(args[0]);
    if(Files.notExists(dir)){
      System.err.println("List all the directoties in a given directory!");
      System.err.format("Error:,%s is not exist, please given the path of a directory?\n",dir);
      return;
    }
    if(isDirectory(dir)){
      try{
        System.err.println("Directories in:" + dir);
        DirectoryStream <Path> files = Files.newDirectoryStream(dir);
        for(Path p : files){
          if(Files.isDirectory(p)){
            System.out.println("  " + p);
          }
        }
      }catch(IOException e){
        e.printStackTrace();
      }
    }else{
      System.out.println(dir + ": is not a valid directory!");
    }
  }
  
  public static boolean isDirectory(Path path){
    try{
      BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);
      return attr.isDirectory();
    }catch(IOException e){
      e.printStackTrace();
    }
    return false;
  }
  
  public static boolean isRegularFile(Path path) {
    try{
      BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);
      return attr.isRegularFile();
    }catch(IOException e){
      e.printStackTrace();
    }
    return false;
  }
}
