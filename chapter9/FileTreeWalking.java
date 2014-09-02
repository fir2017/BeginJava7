import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import static java.nio.file.FileVisitResult.*;
public class FileTreeWalking {
  public static void main(String[] args) {
    Path dir = Paths.get(System.getProperty("user.dir"));
    dir = dir.getParent();
    FileVisitor<Path> fv = new FileList(); 
    
    try{
      Files.walkFileTree(dir,fv);
    }catch(IOException e) {
      e.printStackTrace();
    }
  }  
} 
