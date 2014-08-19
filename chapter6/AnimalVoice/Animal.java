package AnimalVoice;
public abstract class Animal {
  public Animal(String sType){
    type = new String(sType);
    iCount++;
  }
  public String toString(){
    return "This is a " + type;
  }
  public int getCount(){
    return iCount;
  } 
  public abstract void sound();
  public static int iCount = 0;
  private String type;
}
