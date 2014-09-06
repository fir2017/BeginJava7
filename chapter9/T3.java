import java.nio.file.*;
import java.io.IOException;
public class T3 {
  public static void main (String[] args) {
    if(args.length < 1){
      System.err.println("Usage: java T3 source to");
      System.err.println("Error: Source and destination directory required!");
      return;
    }else if(args.length < 2) {
      System.err.println("Usage: java T3 source to");
      System.err.println("Error: Destination directory required!");
      return;
    }    
    
    Path from = Paths.get(args[0]);
    from = from.toAbsolutePath();
    if(Files.notExists(from)){
      System.err.println("Error: Source \"" + from + "\" is not a directory!");
      return;
    }
    
    Path to = Paths.get(args[1]);
    to = to.toAbsolutePath();
    try{
      Files.createDirectories(to);
    }catch(IOException e){
      System.err.println("Error: when create destination file \"" + from + "\"!");
      e.printStackTrace();
      return; 
    }
    
    System.err.println("Begin Copy files from \"" + from + "\" to \"" + to + "\"");
    try(DirectoryStream <Path> files = Files.newDirectoryStream(from)){
      for(Path f : files) {
        if(Files.isRegularFile(f)){
          Files.copy(f,to.resolve(f.getFileName() + "_old"));
          System.err.println("Copied file:\"" + f);
        }
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }

}
