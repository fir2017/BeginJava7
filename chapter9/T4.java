import java.nio.file.*;
import java.io.IOException;
public class T4 {
  public static void main (String[] args) {
    if(args.length <= 0){
      System.err.println("Usage: java T4 dir");
      System.err.println("Error: Directory required!");
      return;
    }    
    try{
      Path dir = Paths.get(args[0]);
      int[] t = getFileDirs(dir);
      System.err.println("Total directories:" + t[1]);
      System.err.println("Total files:" + t[0]);
      //FileVisitor<Path> fc = new FilesCount();
      //Files.walkFileTree(dir,fc);
      //fc = (FilesCount)fc;
      //System.err.println(fc.getTotalFiles());
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public static int[] getFileDirs(Path dir) throws IOException{
    int[] tmpResult = {0,0};
    if(Files.isRegularFile(dir)){
      tmpResult[0] = 1;
    }else if(Files.isDirectory(dir)){
      try(DirectoryStream<Path> paths = Files.newDirectoryStream(dir)){
        int numFiles = 0;
        for(Path p : paths) {
          if(Files.isRegularFile(p)) numFiles++;
          int[] t = getFileDirs(p);
          tmpResult[0] += t[0];
          tmpResult[1] += t[1];
        }
        System.err.println("\"" + dir + "\" contains: " + numFiles);
        /*
        for(Path p : paths) {
          if(Files.isDirectory(p)){
            int[] t = getFileDirs(p);
            tmpResult[0] += t[0];
            tmpResult[1] += t[1];
          }
        }
        */
        //tmpResult[0] += numFiles;
        tmpResult[1]++;
      }catch(IOException e){
        throw e; 
      }
    }
    return tmpResult;
  }
}
