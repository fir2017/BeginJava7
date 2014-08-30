import java.io.PrintWriter;
public class TryFormattedOutput{
  public static void main(String[] args) {
    PrintWriter pt = new PrintWriter(System.out,true);
    pt.println("Formatted output of Number!");
    pt.printf("x = %-15.2f, y=%09.6g%n",27.5, 33.75);
    pt.printf("a = %d, b = %x c = %o%n",5,15,255);
    pt.printf("x = %2$f, y = %1$f%n",33.75, 27.5);
    pt.printf("a = %3$d, b = %1$x c = %2$o%n",5,15,255);
    pt.printf("a = %3$d, b = %<x c = %<o%n",5,15,255);
    
    pt.println("Formatted output with width and precision");
    pt.printf("a = %8d, b = %9o%n",15,27);
    pt.printf("x = %8.4f, b = %5.6g%n",15.6,2700.8);
    pt.printf("a = %-8d, b = %-9o%n",15,27);
    
    int count = 0;
    for (int a = 'a'; a <= 'z'; a++){
      pt.printf("%-2c%<-6x",a);
      count++;
      if(count % 6 == 0) {
        pt.printf("%n");
      }
    }
    pt.printf("%n");
    pt.printf("%s%n%1$25s%n","This is the first test");
    pt.printf("%s%n%1$-25s%n","This is the first test");
    
    String fms = String.format("x = %f, y = %s%n",95.6, "taaf");
    pt.print(fms);
    
    StringBuffer buf = new StringBuffer();
    java.util.Formatter fm = new java.util.Formatter(buf);
    double x = 15.6;
    double y = 56.6;
    String k = "abjlaja";
    fm.format("x = %f, y = %f, s = %s%n",x,y,k);
    pt.print(buf);
    x = 65.66;
    pt.print(buf);
    pt.flush();
  }
}
