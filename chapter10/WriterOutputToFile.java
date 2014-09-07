import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.io.IOException;
public class WriterOutputToFile {
  public static void main (String[] args) {
    if (args.length <= 0) {
      System.out.println("File name required!");
      return;
    }
    String[] s = { "A nod is as good as a wink to a blind horse.",
                   "Least said, soonest mended.",
                   "There are 10 kinds of people in the world, " +
                   "those that understand binary and those that don’t.",
                   "You can’t make a silk purse out of a sow’s ear.",
                   "Hindsight is always twenty-twenty.",
                   "Existentialism has no future.",
                   "Those who are not confused are misinformed.",
                   "Better untaught that ill-taught."
                 };
    Path file = Paths.get(args[0]);
    try(BufferedWriter fileOut = Files.newBufferedWriter(file,Charset.forName("UTF-8"))){
      System.out.println("Begin to write to file!");
      for(String as : s) {
        fileOut.write(as,0,as.length());
        fileOut.newLine();
      } 
      System.out.println("Write finished!");
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
