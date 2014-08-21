//package TryJackets;
public class TryJackets {
  public static void main (String[] args) {
    Jacket[] jackets = {
                         new Jacket(JacketSize.medium, JacketColor.red),
                         new Jacket(JacketSize.extra_large, JacketColor.yellow),
                         new Jacket(JacketSize.small, JacketColor.green),
                         new Jacket(JacketSize.large, JacketColor.blue)
                       };
    System.out.println("The avariable size of Jacket:");
    for(JacketSize s: JacketSize.values()){
      System.out.println("Size of " + s + " is " + s.getSize());
    }
    System.out.println("The avariable color of Jacket:");
    for(JacketColor c:JacketColor.values()){
      System.out.print(c + "\t");
    }
    System.out.println();
    System.out.println("Avariable Jackets:");
    for(Jacket j:jackets){
      System.out.println(j);
    }
  }
}
