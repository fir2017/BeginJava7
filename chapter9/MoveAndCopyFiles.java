import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class MoveAndCopyFiles {
  public static void main(String[] args) {
    Path wkp = Paths.get(System.getProperty("user.dir")); 
    wkp = wkp.getParent();
    wkp = wkp.toAbsolutePath();
  
    Path to = wkp.getParent().resolve("test")
    createDirectory();
    
    copyFiles(wkp,to);
    
  }
  
  public static boolean isDirectory(Path path) {
    try{
      BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);
      return attr.isDirectory();
    }catch(IOException e){
      e.printStackTrace();
    }
    return false;
  }
  
  public static void createDirectory(Path path){
    try{
      Files.createDirectories(path);
      System.err.println(path + ":directory has created!");
    }catch(IOException e) {
      e.printStackTrace();
    }
  }
  
  public static boolean copyFiles(Path from, Path to) {
    if(isDirectory(from) == false){
      System.err.println(from + ": is not a directory!");
      return false;
    }

    if(isDirectory(to) == false) {
      System.err.println(to + ": is not a directory");
      return false;
    }

    try(DirectoryStream <Path> paths = Files.newDirectoryStream(from)){
      System.err.println("Begin copy files from: " + from + ":to:" + to);
      for(Path p : paths) {
        Files.copy(p, to.resolve(p.getFileName()));
        System.err.println("\t copied file:" + p);
      }
    }catch(IOException e){
      e.printStackTrace();
      return false;
    }
    return true;
  }
  
  public static boolean moveFiles(Path from, Path to) {
    if(isDirectory(from) == false) {
      System.err.println(from + ":is not a directory");
      return false;
    }
    if(isDirectory(from) == false) {
      System.err.println(from + ":is not a directory");
      return false;
    }
    
    try(DirectoryStream <Path> paths = Files.newDirectoryStream(from)){
      System.err.println("Begin move files from:" + from + ":to:" + to);
      for(Path p : paths) {
        Files.move(p, to.resolve(p.getFileName()));
        System.err.println("\t moved file:" + p);
      }
    }catch(IOException e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
}
