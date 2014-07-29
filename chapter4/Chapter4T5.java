import static java.lang.Character.*;
public class Chapter4T5 {
  public static void main (String[] args) {
    String sText = "To date, hundreds of fungal genomes have been sequenced and many more are in progress. This wealth of genomic information has provided new directions to study fungal biodiversity. However, to further dissect and understand the complicated biological mechanisms involved in fungal life styles, functional studies beyond genomes are required. Thanks to the developments of current -omics techniques, it is possible to produce large amounts of fungal functional data in a high-throughput fashion (e.g. transcriptome, proteome, etc.). The increasing ease of creating -omics data has also created a major challenge for downstream data handling and analysis. Numerous databases, tools and software have been created to meet this challenge. Facing such a richness of techniques and information, hereby we provide a brief roadmap on current wet-lab and bioinformatics approaches to study functional genomics in fungi";
    char[] caLetters = new char[256];
    int iIndex = -1;
    int iTextLen = sText.length();
    for (int i=0; i < iTextLen; i++){
      char cLetter = sText.charAt(i);
      if (isLetterOrDigit(cLetter)){
        caLetters[++iIndex] = cLetter;
      }else{
        while (iIndex >=0){
          System.out.print(caLetters[iIndex]);
          iIndex--;
        }
        System.out.print(cLetter);
      } 
    }
    while (iIndex >=0){
      System.out.print(caLetters[iIndex]);
      iIndex--;
    }
    System.out.println();
  }
}
