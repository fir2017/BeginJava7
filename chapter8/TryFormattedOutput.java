import java.io.PrintWriter;
public class TryFormattedOutput{
  public static void main(String[] args) {
    PrintWriter pt = new PrintWriter(System.out,true);
    pt.println("Formatted output of Number!");
    pt.printf("x = %-15.2f, y=%09.6g%n",27.5, 33.75);
    pt.printf("a = %d, b = %x c = %o%n",5,15,255);
  }
}
