public class EnumTest {
  enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
  public static void main(String[] args){
    Day today = Day.Tuesday;
    Day tomorrow = Day.Wednesday;
    Day yesterday = Day.Monday;
    System.out.println("Yesterday is " + yesterday);
    System.out.println("Today is " + today);
    System.out.println("Tomorrow is " + tomorrow);
    /*tomorrow++;
    System.out.println("Tomorrow++ is " + tomorrow);
    Can not use ++,--,+,- operation
    */
  }
}
