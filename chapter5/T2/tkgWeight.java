public class tkgWeight {
  public static void main(String[] args) {
    tkgWeight tkg1 = new tkgWeight(10,5,20001);
    System.out.println(tkg1);
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
