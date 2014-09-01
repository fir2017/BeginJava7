import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
public class TryPath {
  public static void main (String[] args) {
    FileSystem fs = FileSystems.getDefault(); 
    Path path = fs.getPath("garbage.java");
    getAttributes(path);
    
    path = Paths.get(System.getProperty("user.dir"));
    getAttributes(path);
    
    path = fs.getPath("/media/liry/D/testJava","BeginJava7","chapter9","TryPath.java");
    getAttributes(path);
    
    path = Paths.get(System.getProperty("user.dir"));
    System.out.println(path.resolve(Paths.get("chapter9")));
    System.out.println(path.relativize(Paths.get("/media/liry/D/testJava","BeginJava7","chapter9","TryPath.java")));
  
  }
  
  static void getAttributes(Path path){
    try{
      System.out.println("The information For path itself:" + path);
      System.out.println("\t:" + (path.isAbsolute() ? "Absolut path" : "relative path"));
      System.out.println("\tfile name:" + path.getFileName());
      System.out.println("\tName Counts:" + path.getNameCount());
      System.out.println("\tParent:" + path.getParent());
      System.out.println("\tRoot:" + path.getRoot());
      System.out.println("\tHash Code:" + path.hashCode());
      path = path.toAbsolutePath();
      System.out.println("\tThe absolutePath:" + path);
      
      System.out.println("The dirctory or file information if it exists:");
      if(Files.notExists(path)){
        System.out.println(path + ": does not exist");
        return;
      } 
      BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);
      System.out.println("\t:" + (attr.isDirectory() ? "Directory" : "File"));
      System.out.println("\t:" + (attr.isDirectory() ? "Directory" : attr.isRegularFile() ? "Regular File" : "Other Type"));
      System.out.println("\tcreation time:" + attr.creationTime());
      System.out.println("\tlast access time:" + attr.lastAccessTime());
      System.out.println("\tlast modified time:" + attr.lastModifiedTime());
      System.out.println("\tsize:" + attr.size());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
