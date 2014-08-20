public class Flea extends Animal {
  public Flea(String sName, String sBreed){
    super("Flea");
    this.sName = sName;
    this.sBreed = sBreed;
  }
   
  public Flea(String sName){
    super("Flea");
    this.sName = sName;
    sBreed = "Unkown";
  }
   
  public Flea(Flea aFlea){
    super(aFlea);
    sName = aFlea.sName;
    sBreed = aFlea.sBreed;
  } 
  
  public void setName(String sName){
    this.sName = sName;
  }
  
  public String getName(){
    return sName;
  }
  
  public void setBreed(String sBreed){
    this.sBreed = sBreed;
  }
  
  public String getBreed(){
    return sBreed;
  }
  
  @Override
  public String toString(){
    return super.toString() + ", name is " + sName + ", it is " + sBreed;
  }
  
  @Override
  public void sound(){
    System.out.println("Psst, Psst, ...");
  }
  protected String sName;
  protected String sBreed;
}
