package AnimalVoice;
public class Duck extends Animal {
  public Duck (String sName){
    super("Duck");
    this.sName = sName;
    sBreed = "Unkown";
  }
  public Duck (String sName, String sBreed){
    super("Duck");
    this.sName = sName;
    this.sBreed = sBreed;
  }
  
  @Override
  public String toString(){
    return super.toString() + ", with name is " + sName + ", and breed is " + sBreed;
  }
  
  @Override
  public void sound(){
    System.out.println(super.toString() + ", and sound \"quack, quack, ...\"!");
  }

  private String sName;
  private String sBreed;
}
