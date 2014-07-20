import static java.lang.Math.*;
public class LuckyStars {
  public static void main (String[] args){
    String[] saStars = {"Robert Redford", "Marilyn, Monroe", "Boris Karloff", "Lassie", "Hopalong Cassidy", "Trigger"};
    System.out.println("Today's lucky star is:" + saStars[(int)(random() * saStars.length)]);
  }
}
