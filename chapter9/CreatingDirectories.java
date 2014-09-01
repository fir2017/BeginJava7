import java.nio.file.*;
import java.io.IOException;
public class CreatingDirectories {
  public static void main (String[] args) {
    Path relPath = Paths.get("Test.class");
    createDirectory(relPath);
    createDirectory(relPath);
    
    Path absPath = Paths.get("/home/liry","dir1","dir2","dir3");
    createDirectory(absPath);
    createDirectories(absPath);
    createDirectories(absPath);
    System.out.println("Ok exit");
  }
  static void createDirectory(Path path){
    try{
      Files.createDirectory(path);
      System.out.println(path.toAbsolutePath());
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  static void createDirectories(Path path) {
    try{
      Files.createDirectories(path);
      System.out.println(path.toAbsolutePath());
    }catch(IOException e) {
      e.printStackTrace();
    }
  }
}
