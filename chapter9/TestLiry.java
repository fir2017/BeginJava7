import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
public class TestLiry {
  public static void main(String[] args) {
    for(FileVisitOption f : FileVisitOption.values()){
      System.out.println(f);
    }
    for(FileVisitResult f : FileVisitResult.values()){
      System.out.println(f);
    }
  }
}
