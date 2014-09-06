import static java.nio.file.FileVisitResult.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FilesCount extends SimpleFileVisitor <Path> {
  @Override
  public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attr) {
    System.err.println("Now enter:" + dir);
    currentDirFiles = 0;
    return CONTINUE;
  } 
  
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException e) {
    if(e == null){
      System.err.println("\"" + dir + "\" contains: " + currentDirFiles);
      System.err.println("Now leave:" + dir);
      //currentDirFiles = 0;
    }else{
      e.printStackTrace();
    } 
    return CONTINUE;
  }
  
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
    if(attr.isRegularFile() || attr.isSymbolicLink()){
      totalFiles++;
      currentDirFiles++;
     }
     return CONTINUE;
  }
  
  @Override 
  public FileVisitResult visitFileFailed(Path file, IOException e) {
    System.err.println("Error in:" + file);
    e.printStackTrace();
    //throw e;
    return CONTINUE;
  }
  
  public int getTotalFiles(){
    return totalFiles;
  }
  
  private int totalFiles = 0;
  private int currentDirFiles = 0;
  private int numDirectories = 0;
} 
