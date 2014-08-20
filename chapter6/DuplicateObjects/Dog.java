public class Dog extends Animal {
  public Dog(String sName, String sBreed){
    super("Dog");
    this.sName = sName;
    this.sBreed = sBreed;
  }
  public Dog(String sName){
    super("Dog");
    this.sName = sName;
    sBreed = "Unkown";
  }
  public Dog (Dog aDog){
    super(aDog);
    sName = aDog.sName;
    sBreed = aDog.sBreed;
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
    return super.toString() + ", name is " + sName + ", and it is " + sBreed;
  }
  @Override
  public void sound(){
    System.out.println("Woof, Woof, ...");
  }
  protected String sName;
  protected String sBreed;
}
