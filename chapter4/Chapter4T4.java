import static java.lang.Math.*;
public class Chapter4T4 {
  public static void main (String[] args) {
    String[] saDay = new String[10];
    String[] saMonthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    for (int i=0; i < 10; i++) {
      int iYear = (int)(random() * 2100);
      int iMonth = (int)(random() * 12 + 1);
      int iDay = 31;
      switch (iMonth){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
         // iDay = (int)(random()*31 + 1); 
          break; 
        case 2:
          if ( (iYear % 400 == 0) || ((iYear % 4 == 0 ) & ( iYear % 100 != 0 ))) {
            iDay = 29;  
          }else{
            iDay = 28;  
          } 
          break;
        default:
          iDay = 30;
          iDay = (int)(random() * 30 + 1);
      }
      iDay = (int)(random() * iDay + 1);
      saDay[i] = iMonth + "/" + iDay + "/" + iYear;
    }
    for (String sDay : saDay){
      System.out.print(sDay + ":");
      String[] saDayCombine = sDay.split("/",0);
      switch (Integer.parseInt(saDayCombine[1])){
        case 1:
          System.out.print(saDayCombine[1] + "st ");
          break;
        case 2:
          System.out.print(saDayCombine[1] + "nd ");
          break;
        case 3:
          System.out.print(saDayCombine[1] + "rd ");
          break;
        default:
          System.out.print(saDayCombine[1] + "th ");
      }
      System.out.print(saMonthName[Integer.parseInt(saDayCombine[0]) - 1]);
      System.out.println(" " + saDayCombine[2]);
    }
  }
}
