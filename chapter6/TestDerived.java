public class TestDerived {
  public static void main(String[] args) {
    Dog aDog = new Dog("Fido","Chihuanhua");
    System.out.println(aDog.getCount());
    Dog starDog = new Dog("Lassia");
    System.out.println(aDog.getCount());
    System.out.println(aDog);
    System.out.println(starDog);
  }
}
