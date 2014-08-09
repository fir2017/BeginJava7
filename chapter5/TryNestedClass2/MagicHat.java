import java.util.Random;
public class MagicHat {
  static Random select = new Random();
  static int iNumRabbits = 5;
  
  static String[] rabitteNames = {"Green", "Thomper", "Kerry", "Obama", "John"};
  static int[] isNumNameSelects = new int[rabitteNames.length];

  public MagicHat (String sName) {
    this.hatName = sName;
    rabbites = new Rabbite[1 + select.nextInt(iNumRabbits)];
    for (int i =0; i < rabbites.length; i++){
      rabbites[i] = new Rabbite();
    } 
    for ( int i = 0; i < rabitteNames.length; i++){
      System.out.println(rabitteNames[i] + " has used: " + isNumNameSelects[i]);
    }     
  }

  public String toString(){
    StringBuffer hat = new StringBuffer(hatName + "\n\t");
    for (Rabbite rab : rabbites) {
      hat.append(rab.toString() + "\t");
    }
    return hat.toString();
  }
  
  private String hatName;
  private Rabbite[] rabbites;
  
  class Rabbite {
    public Rabbite(){
      int iSelected = select.nextInt(rabitteNames.length);
      sName = rabitteNames[iSelected] + (++isNumNameSelects[iSelected]); 
    }
   
    public String toString(){
      return sName + ": parent is " + hatName;       
    }

    private String sName;
  }
}
