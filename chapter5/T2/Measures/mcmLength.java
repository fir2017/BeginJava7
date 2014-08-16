public class mcmLength {
  public static void main (String[] args) {
    mcmLength mcm1 = new mcmLength(10,24,50);
    mcmLength mcm2 = new mcmLength(5489);
    mcmLength mcm3 = new mcmLength();
    System.out.println("mcm1=" + mcm1);
    System.out.println("mcm2=" + mcm2);
    System.out.println("mcm3=" + mcm3);
    mcm3.add(345);
    System.out.println("mcm3 + 345 = " + mcm3);
    mcm2.substract(498);
    System.out.println("mcm2 - 498 = " + mcm2);
    mcm1.multiply(5);
    System.out.println("mcm1 * 5 = " + mcm1);
    mcm3.divide(9);
    System.out.println("mcm3 / 5 = " + mcm3);
    System.out.print("mcm1:" + mcm1);
    mcm1.getArea(mcm2);
    System.out.println(" and mcm2:" + mcm2 + " area is: " + mcm1);
  }
  public mcmLength (int iM, int iCM, int iMM){
    int MM = iM * 1000 + iCM * 10 + iMM;
    this.iM = (int)(MM / 1000);
    this.iCM = (int)((MM - this.iM * 1000)/10);
    this.iMM = MM - this.iM * 1000 - this.iCM * 10;
  }
  public mcmLength (int iMM) {
    iM = iMM / 1000;
    iCM = (iMM - iM * 1000)/10;
    this.iMM = iMM - iM * 1000 - iCM * 10;
  }
  public mcmLength (double dCM) {
    iMM = (int)(Math.round((float)(dCM * 10)));
    iM = (int)(iMM/1000);
    iCM = (int)((iMM - 1000 * iM)/10);
    iMM = iMM - 1000 * iM - 10 * iCM;
  }
  public mcmLength () {
    iM = 0;
    iCM = 0;
    iMM = 0;
  }
  public void add ( int iMM ) {
    iMM += this.iMM + iM * 1000 + iCM * 10;
    imm2mcm(iMM);
  }
  public void substract ( int iMM ) {
    iMM = iM * 1000 + iCM * 10 + this.iMM - iMM;
    imm2mcm(iMM);
  }
  public void multiply ( int iMM ) {
    iMM = (iM * 1000 + iCM * 10 + this.iMM) * iMM;
    imm2mcm(iMM);
  }
  public void divide ( int iMM) {
    iMM = (int) ((iM * 1000 + iCM * 10 + this.iMM)/iMM);
    this.iMM = (int)(this.iMM / iMM);
    imm2mcm(iMM);
  }
  
  public int getArea (mcmLength aMcmLen){
    return getLengthInMM() * aMcmLen.getLengthInMM();
  }

  public int compareTo (mcmLength aMcmLen) {
    return getLengthInMM() - aMcmLen.getLengthInMM();
  }  

  public int getLengthInMM () {
    return iM * 1000 + iCM * 10 + iMM;
  }
  private void imm2mcm (int iMM) {
    iM = (int)(iMM / 1000);
    iCM = (int)((iMM - 1000 * iM)/10);
    this.iMM = iMM - 1000 * iM - 10 * iCM;
  }
  public String toString() {
    return iM + "," + iCM + "," + iMM;
  }
  private int iM;  //meters
  private int iCM; // centmeters
  private int iMM; // millionmeters
}
