public class TryNestClass {
  public static void main (String[] args) {
    System.out.println(new MagicHat("Tomm"));
    System.out.println(new MagicHat("Bill"));
    System.out.println(new MagicHat("Bush"));
    
    MagicHat aHat = new MagicHat("Jacsion");
    MagicHat.Rabbite aRabbite = aHat.new Rabbite();
    System.out.println(aHat);
    System.out.println(aRabbite);
  }
} 
