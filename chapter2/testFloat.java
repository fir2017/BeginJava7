public class testFloat {
  public static void main(String[] arg){
    float fTestInit = 1.56;//assembly raise error, due to the defaul type is double
    short sTestInit = 0;//But this will be ok 
    sTestInit = 10;
    System.out.println("float with double default:" + fTestInit);
  } 
}
