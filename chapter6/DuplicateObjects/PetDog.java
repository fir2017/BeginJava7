public class PetDog extends Dog {
  public PetDog(String sDogName, String sDogBreed, String sFleaName, String sFleaBreed){
    super(sDogName,sDogBreed);
    petFlea = new Flea(sFleaName,sFleaBreed);
  }
  
  public PetDog(PetDog aPetDog){
    super(aPetDog);
    petFlea = new Flea(aPetDog.petFlea);
  }
  
  public Flea getFlea(){
    return petFlea;
  }
  @Override 
  public void sound(){
    System.out.println("Woof");
  }
  @Override
  public String toString(){
    return super.toString() + ". a pet dog, has a flea:" + petFlea;
  }
  protected Flea petFlea;
}
