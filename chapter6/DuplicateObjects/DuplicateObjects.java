public class DuplicateObjects {
  public static void main(String[] args){
    PetDog myPet = new PetDog("Fang", "Chihuahua", "Max", "Circus flea");
    System.out.println("My pet details: \n" + myPet);
    PetDog yourPet = new PetDog(myPet);
    System.out.println("Your pet details:\n" + yourPet);
    yourPet.setName("Gnasher");
    yourPet.getFlea().setName("Altas");
    System.out.println("My pet details: \n" + myPet);
    System.out.println("Your pet details:\n" + yourPet);
  }
}
