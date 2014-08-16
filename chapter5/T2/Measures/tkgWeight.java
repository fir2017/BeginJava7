public class tkgWeight {
  public static void main(String[] args) {
    tkgWeight tkg1 = new tkgWeight(10,5,20001);
    tkgWeight tkg2 = new tkgWeight(1000);
    tkgWeight tkg3 = new tkgWeight(9856.87);
    tkgWeight tkg4 = new tkgWeight();
    System.out.print("(" + tkg4 + ")");
    tkg4.add(156789);
    System.out.println(" add 156789 grames = (" + tkg4 + ")");
    System.out.print("(" + tkg1 + ")");
    tkg1.substract(100000000);
    System.out.println(" substract 100,000,000 grames = (" + tkg1 + ")");
    System.out.print("(" + tkg2 + ")");
    tkg2.multipy(10);
    System.out.println(" multipy 10 grames = (" + tkg2 + ")");
    System.out.print("(" + tkg3 + ")");
    tkg3.divide(51);
    System.out.println(" divide 51 grames = (" + tkg3 + ")");
    System.out.println("(" + tkg1 + ") - (" + tkg2 + ") = " + tkg1.compareTo(tkg2));
  }
  public tkgWeight (int iTon, int iKillo, int iGrame) {
    toTKG(iTon * 1000 * 1000 + iKillo * 1000 + iGrame); 
  }
  public tkgWeight ( int iTotalGrame){
    toTKG(iTotalGrame);
  }
  public tkgWeight (double iTotalKillo){
    toTKG(Math.round((float)(iTotalKillo * 1000)));
  }
  public tkgWeight (tkgWeight atkg){
    toTKG(atkg.getTotalGrame());
  }
  public tkgWeight(){
    iT = 0;
    iK = 0;
    iG = 0;
  }
  public void add (int iGrame) {
    toTKG(getTotalGrame() + iGrame); 
  }
  public void substract (int iGrame) {
    toTKG(getTotalGrame() - iGrame); 
  }
  public void multipy (int iGrame) {
    toTKG(getTotalGrame() * iGrame); 
  }
  public void divide (int iGrame) {
    toTKG(getTotalGrame() / iGrame); 
  }
  public int getTotalGrame(){
    return iT * 1000 * 1000 + iK * 1000 + iG;
  }
  public int compareTo(tkgWeight atkg){
    return getTotalGrame() - atkg.getTotalGrame();
  }
  public String toString(){
    return iT + "," + iK + "," + iG;
  }
  private void toTKG(int iTotalGrame) {
    iT = (int)(iTotalGrame / 1000 /1000);
    iK = (int)(iTotalGrame / 1000 - iT * 1000);
    iG = iTotalGrame - iT * 1000 * 1000 - iK * 1000;
  }
  private int getWeightInGrame(){
    return iT * 1000 + iK * 1000 + iG;
  }
  private int iT; // ton
  private int iK; // killogram
  private int iG; // Grame
}
