public class Chapter4T3 {
  public static void main (String[] args) {
    String sText = "To date, hundreds of fungal genomes have been sequenced and many more are in progress. This wealth of genomic information has provided new directions to study fungal biodiversity. However, to further dissect and understand the complicated biological mechanisms involved in fungal life styles, functional studies beyond genomes are required. Thanks to the developments of current -omics techniques, it is possible to produce large amounts of fungal functional data in a high-throughput fashion (e.g. transcriptome, proteome, etc.). The increasing ease of creating -omics data has also created a major challenge for downstream data handling and analysis. Numerous databases, tools and software have been created to meet this challenge. Facing such a richness of techniques and information, hereby we provide a brief roadmap on current wet-lab and bioinformatics approaches to study functional genomics in fungi. ";
    System.out.println(sText); 
    String[] saWordsFromText = sText.split("[,. ]+",0);
    int iIndex = saWordsFromText.length - 1;
    while (iIndex > 0){
      for (int i = 0; i < iIndex; i++){
        if (saWordsFromText[i].compareTo(saWordsFromText[i+1]) > 0 ) {
          String sTmp = saWordsFromText[i];
          saWordsFromText[i] = saWordsFromText[i + 1];
          saWordsFromText[i + 1] = sTmp;
        }
      }
      iIndex--;
    }
    for (int i = 0; i < saWordsFromText.length; i++){
      System.out.println(saWordsFromText[i]);
    }
  }
}
