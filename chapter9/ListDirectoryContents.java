import java.nio.file.*;
import java.io.IOException;
public class ListDirectoryContents {
  public static void main (String[] args) {
    Path path = Paths.get(System.getProperty("user.dir"));
    System.out.println("The files and directories in: " + path);
    filterDirectory(path,null); 
    System.out.println();
    System.out.println("The files and directories in with *.java list: " + path);
    filterDirectory(path,"*.java"); 
  }
  
  public static void filterDirectory(Path path, String filter) {
    try(DirectoryStream<Path> paths = filter == null ? Files.newDirectoryStream(path) : Files.newDirectoryStream(path,filter)) {
      for(Path p : paths){
        System.out.println(p);
      }
    }catch(IOException e) {
      e.printStackTrace();
    }
  }
}
