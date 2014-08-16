import Measures.*;
public class MatarialMeasure {
  public static void main(String[] args) {
    
  }

  public MatarialMeasure(mcmLength length, mcmLength width, tkgWeight density){
    this.length = new mcmLength(length.getLengthInMM());
    this.width  = new mcmLength(width.getLengthInMM()); 
    this.density = new tkgWeight(density.getTotalGrame());
  }
  public MatarialMeasure(int totalLength, int totalWidthe, int density){
    length = new mcmLength(totalLength);
    width = new mcmLength(totalWidth);
    this.density = new tkgWeight(density);
  }
  public double getWeight(){
    return length.getAreaM(width) * density.getTotalGrame/1000;
  }
  private mcmLength length;
  private mcmLength width;
  private tkgWeight density;
}
