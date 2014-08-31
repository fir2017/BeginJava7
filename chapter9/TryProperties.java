import java.util.Properties;
public class TryProperties {
  public static void main (String[] args) {
    Properties p = System.getProperties(); 
    p.list(System.out);
  }
}
