package AnimalVoice;
public class Cat extends Animal {
  public Cat(String sName, String sBreed){
    super("Cat");
    this.sName = sName;
    this.sBreed = sBreed;
  }
  public Cat(String sName){
    super("Cat");
    this.sName = sName;
    sBreed = "Unkown";
  }
  
  public String toString(){
    return super.toString() + ", with name is " + sName + ", and breed is " + sBreed;
  }
  @Override
  public void sound(){
    System.out.println(super.toString() + ", and sound \"maiiaooww, maiiaoow, ...\"!");
  }
  protected String sName;
  protected String sBreed;
}
