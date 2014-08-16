import Measures.*;
public class MatarialMeasure {
  public static void main(String[] args) {
    MatarialMeasure carpet1 = new MatarialMeasure(4000,2090,1250);
    MatarialMeasure carpet2 = new MatarialMeasure(3570,5000,1050);     
    System.out.println("The weight of carpet1 is:" + carpet1.getWeightKg() + "Kg");
    System.out.println("The weight of carpet2 is:" + carpet2.getWeightKg() + "Kg");
    System.out.println("The weight of 200 carpet1 is:" + 200 * carpet1.getWeightKg() + "Kg"); 
    System.out.println("The weight of 60 carpet2 is:" + 60 * carpet2.getWeightKg() + "Kg"); 
  }

  public MatarialMeasure(mcmLength length, mcmLength width, tkgWeight density){
    this.length = new mcmLength(length.getLengthInMM());
    this.width  = new mcmLength(width.getLengthInMM()); 
    this.density = new tkgWeight(density.getTotalGrame());
  }
  public MatarialMeasure(int totalLength, int totalWidth, int density){
    length = new mcmLength(totalLength);
    width = new mcmLength(totalWidth);
    this.density = new tkgWeight(density);
  }
  public double getWeightKg(){
    return length.getAreaM(width) * density.getTotalGrame()/1000;
  }
  private mcmLength length;
  private mcmLength width;
  private tkgWeight density;
}
