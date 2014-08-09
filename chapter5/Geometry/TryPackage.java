import Geometry.Components.*;
       
public class TryPackage {
  public static void main (String[] args) {
    double[][] daCoords = { {1.0,0.0},{6.0,0.0},{6.0,10.0},{10.0,10.0},{10.0,-14.0},{8.0,-14.5}};
    Point1[] aPoints = new Point1[daCoords.length];
    for(int i= 0; i < daCoords.length; i++) {
      aPoints[i] = new Point1(daCoords[i][0],daCoords[i][1]);
    }
    Line1 aLine = new Line1(0,0,0,0);
    double dTotalLen = 0;
    //System.out.println("The line (" + aLine.toString() + ") is: " + aLine.length());
    int iNumLines = 0;
    for (int i=0; i < aPoints.length -1 ; i++ ){
      for ( int j = i + 1; j < aPoints.length; j++ ) {
        //aLine = new Line1(aPoints[i], aPoints[i+1]); 
        aLine.setStart(aPoints[i]);
        aLine.setEnd(aPoints[j]);
        //System.out.println(aLine.getStart());
        System.out.println("The line " + aLine.toString() + " is: " + aLine.length());
        dTotalLen += aLine.length();
        iNumLines++;
      }
    }
    System.out.println("The total length for " + iNumLines + " lines is: " + dTotalLen);
  }
}
