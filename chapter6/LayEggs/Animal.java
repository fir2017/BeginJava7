public class Animal {
  public Animal(String sType){
    this.sType = sType;
  }
  public Animal(Animal aAnimal){
    sType = aAnimal.sType;
  }
  public String toString(){
    return "this is a " + sType;
  }
  public void sound(){
  
  }
  protected String sType;
}
