import java.util.Formatter;
import static java.lang.Math.random;
public class T4 {
  public static void main (String[] args) {
    int numIteration = 20;
    StringBuffer s = new StringBuffer();
    Formatter sf = new Formatter(s);
    double[] t = new double[20];
    StringBuffer fs = new StringBuffer();
    for (int i = 0; i < numIteration; i++) {
      t[i] = random()*100 - 50;
      fs.append("%" + (i+1) + "$7.2f  ");
      if ((i+1) % 5 == 0) fs.append("%n");
    }
    System.out.println("Format:" + fs);
    sf.format(fs.toString(),t[0],t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8],t[9],t[10],t[11],t[12],t[13],t[14],t[15],t[16],t[17],t[18],t[19]);
    //sf.format(fs.toString(),t);
    System.out.println(s);
  }
}
