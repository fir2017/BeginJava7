public class TryInitialization {
  static int[] iaRandoms = new int[10];
  double[] daRandoms = new double[10];
  static int iNumInitialStatic = 0;
  static int iNumInitialInstance = 0;
  static {
    System.out.println("now initialization static block!");
    iNumInitialStatic++;
    for (int i=0; i < iaRandoms.length; i++) {
      iaRandoms[i] = (int)(Math.random() * 100 + 1);
    }
  }
  {
    System.out.println("Now initialization instance block!");
    iNumInitialInstance++;
    for(int i=0; i < daRandoms.length; i++) {
      daRandoms[i] = Math.random() * 100;
    }
  }
  
  static void getStaticValues(){
    System.out.println("now calling getStaticValues method with iNumInitialStatic: " + iNumInitialStatic);
    for (int i = 0; i < iaRandoms.length; i++) {
      System.out.println(iaRandoms[i]); 
    }
  }
  
  void getInstanceValues () {
    System.out.println("now calling getInstanceValues method with iNumInitialInstance: " + iNumInitialInstance);
    for (int i = 0; i < daRandoms.length; i++){
      System.out.println(daRandoms[i]);
    }
  }
  
  public static void main (String[] args) {
    System.out.println("no instance for TryInitialization!");
    TryInitialization.getStaticValues(); 
    TryInitialization tiObject1 = new TryInitialization();
     
  }
}
