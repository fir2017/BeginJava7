public class CreateSpheres {
  public static void main (String[] args) {
    System.out.println("Number of sphere objects: " + Sphere.count);
    Sphere ball = new Sphere(2.5, 10.1, 20.5,30.6);
    System.out.println("now, Number of Sphere objects: " + Sphere.count);
    Sphere golbal = new Sphere(10.2,9,9,9);
    System.out.println("Now, Number of Sphere objects: " + Sphere.count);

    System.out.println("The volumn of ball: " + ball.getVolumn());
    System.out.println("The volumn of golbal: " + golbal.getVolumn());
  }
}
