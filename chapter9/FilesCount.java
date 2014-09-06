import static java.nio.file.VisitFileResult.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FilesCount extends SimpleFileVisitor {
  @Override
  public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attr) throws IOException {
    currentDirFiles = 0;
  } 
  
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
    
  }
  
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {

  }
  
  @Override 
  public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {

  }
  
  private int totalFiles = 0;
  private int currentDirFiles = 0;
  private int numDirectories = 0;
} 
