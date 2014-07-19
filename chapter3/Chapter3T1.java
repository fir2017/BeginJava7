import static java.lang.Math.*;
public class Chapter3T1 {
  enum BreakfastFood {bread,milk,rice,noodle,waffle,fruit}
  public static void main (String[] args) {
    int iType = 0;
    BreakfastFood BffMe = BreakfastFood.bread;
    iType = (int)(random()*6 );
    switch (iType){
      case 0:
        BffMe = BreakfastFood.bread;
        break; 
      case 1:
        BffMe = BreakfastFood.milk;
        break; 
      case 2:
        BffMe = BreakfastFood.rice;
        break; 
      case 3:
        BffMe = BreakfastFood.noodle;
        break; 
      case 4:
        BffMe = BreakfastFood.waffle;
        break; 
      case 5:
        BffMe = BreakfastFood.fruit;
        break; 
      default:
        System.out.println("unkonw type of breakfast:" + iType);
    } 
    System.out.println("You choose " + BffMe + " for breakfast today!");
  }
}
