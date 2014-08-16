public class Dog extends Animal {
  public Dog(String sName) {
    super("dog");
    this.sName = new String(sName);
    sBreed = "Unknown";
  } 
  public Dog(String sName,String sBreed){
    super("dog");
    this.sName = new String(sName);
    this.sBreed = new String(sBreed);
  }
  public String toString(){
    return super.toString() + ",with name is " + sName + ", and breed is " + SBreed;
  }
  protected String sName;
  protected String sBreed;
}
