public class Duck extends Animal {
  public static void main(String[] args){
    Animal[] pets = { new Dog("Jimmy","small cat"),
                      new Duck("Donald","Eider")
                    };
    for(Animal a : pets) {
       System.out.println(a.getClass().getName() + "\n" + a);
       if ( a instanceof Duck){
         ((Duck)a).layEgg();
       }else{
         a.sound();
       }
    }
    Duck aDuck = new Duck("Donald","Eider");
    Animal aPet = aDuck;
    ((Duck)aPet).layEgg();
  }
  public Duck(String sName, String sBreed){
    super("Duck");
    this.sName = sName;
    this.sBreed = sBreed;
  }
  public Duck(String sName){
    super("Duck");
    this.sName = sName;
    sBreed = "Unkown";
  }
  public Duck (Duck aDog){
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
  public void layEgg(){
    System.out.println("Eggs, Eggs, ...");
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
