package AnimalVoice;
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
  @Override
  public String toString(){
    return super.toString() + ", with name is " + sName + ", and breed is " + sBreed;
  }
  @Override
  public void sound(){
    System.out.println(super.toString() + ", and sound \"Woof, Woof, ...\"!");
  }
  protected String sName;
  protected String sBreed;
}
