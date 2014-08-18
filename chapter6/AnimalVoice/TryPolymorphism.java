import java.util.Random;
import AnimalVoice.*;
public class TryPolymorphism {
  public static void main (String[] args) {
    System.out.println("The number of animals: " + Animal.iCount);
    Animal[] animals = {
                         new Duck("Tom"), 
                         new Dog("Jamy"), 
                         new Cat("Bullin"),
                         new Spaniel("Obama")
                       }; 
    Animal petAnimal = null;
    Random select = new Random();
    for (int i = 0; i < 5; i++){
      petAnimal = animals[select.nextInt(animals.length)];
      //System.out.println("The type of Animal:");
      System.out.println(petAnimal);
      petAnimal.sound();
    } 
  }
}
