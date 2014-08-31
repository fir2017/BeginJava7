import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileStore;
import java.io.IOException;
public class GetFileStores {
  public static void main (String[] args) {
    FileSystem fs = FileSystems.getDefault();
    Iterable<FileStore> fst = fs.getFileStores();
    long K = 1024;
    long M = K * 1024;
    long G = M * 1024;
    try{
      for(FileStore s : fst) {
        System.out.println(s.name() + "\t" + s.type() + "\t" + s.getTotalSpace()/G + "\t" + s.getUsableSpace()/G + "\t" + s.getUnallocatedSpace()/G); 
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
} 
