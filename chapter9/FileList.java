import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import static java.nio.file.FileVisitResult.*;
public class FileList extends SimpleFileVisitor<Path> {
  @Override 
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr){
    System.err.format("\n%sDirectory: %s",intend, dir);
    intend.append("  "); 
    return CONTINUE;
  }
  
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException e) {
    if(e != null){
      System.err.format("\n%sError in Directory:%s%n%s",intend, dir, e);
    }
    int l = intend.length();
    intend.delete(l - 2, l);
    return CONTINUE;
  }
  
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
    if (attr.isRegularFile()){
      System.err.format("\n%sregular file:%s",intend, file);
    }else if (attr.isSymbolicLink()) {
      System.err.format("\n%symbolic link file:%s",intend, file);
    }
    return CONTINUE;
  }
  
  @Override
  public FileVisitResult visitFileFailed(Path file, IOException e) {
    System.err.format("\n%sAttributes for file %s cann't read:%s",intend, file, e);
    return CONTINUE;
  }

  private StringBuilder intend = new StringBuilder("  ");
}
