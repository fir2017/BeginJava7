import java.util.Random;
public class MagicHat {
  static Random select = new Random();
  static int iNumRabbits = 5;
  
  public MagicHat (String sName) {
    this.sName = sName;
    rabbites = new Rabbite[1 + select.nextInt(iNumRabbits)];
    for (int i =0; i < rabbites.length; i++){
      rabbites[i] = new Rabbite();
    } 
    for ( int i = 0; i < Rabbite.rabitteNames.length; i++){
      System.out.println(Rabbite.rabitteNames[i] + " has used: " + Rabbite.isNumNameSelects[i]);
    }     
  }

  public String toString(){
    StringBuffer hat = new StringBuffer(sName + "\n\t");
    for (Rabbite rab : rabbites) {
      hat.append(rab.toString() + "\t");
    }
    return hat.toString();
  }
  
  private String sName;
  private Rabbite[] rabbites;
  
  static class Rabbite {
    static String[] rabitteNames = {"Green", "Thomper", "Kerry", "Obama", "John"};
    static int[] isNumNameSelects = new int[rabitteNames.length];
    public Rabbite(){
      int iSelected = select.nextInt(rabitteNames.length);
      sName = rabitteNames[iSelected] + (++isNumNameSelects[iSelected]); 
    }
   
    public String toString(){
      return sName;       
    }

    private String sName;
  }
}
