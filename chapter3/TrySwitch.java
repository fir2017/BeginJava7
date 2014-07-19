import static java.lang.Math.*;
public class TrySwitch {
  enum WashType {cotton,wool,linen,synthetic}
  public static void main(String[] args) {
    WashType wash = WashType.synthetic;
    // Type of clothes 1 for cotton, 2 and 3 for wool, 4 for linen, 5 for synthetic
    byte bClothes = (byte)(random() * 5 + 1);
    switch (bClothes){
      case 1:
        System.out.println("Washing cotton type clothes");
        wash = WashType.cotton;
        break;
      case 2:
        System.out.println("Washing wool type clothes");
        wash = WashType.wool;
        break;
      case 3:
        System.out.println("Washing wool type clothes");
        wash = WashType.wool;
        break;
      case 4:
        System.out.println("Washing linen type clothes");
        wash = WashType.linen;
        break;
      case 5:
        System.out.println("Washing synthetic type clothes");
        wash = WashType.synthetic;
        break;
      default:
        System.out.println("Washing synthetic type clothes");
        wash = WashType.synthetic;
    }

    System.out.println("Wash is " + wash);
    
    switch(wash){
      case cotton:
        System.out.println("Templature is 120 for cotton type clothes.");
        break;
      case wool:
        System.out.println("Templature is 170 for wool type clothes.");
        break;
      case linen:
        System.out.println("Templature is 130 for linen type clothes.");
        break;
      case synthetic:
        System.out.println("Templature is 130 for synthetic type clothes.");
    }
    
  }
}
