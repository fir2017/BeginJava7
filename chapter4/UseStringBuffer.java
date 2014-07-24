public class UseStringBuffer {
  public static void main (String[] args) {
    StringBuffer strbfSentence = new StringBuffer(20);
    System.out.println("StringBuffer object capacity is: " + strbfSentence.capacity() + " and the length is: " + strbfSentence.length());
    String[] saWords = {"Too","many","cooks","spoil", "the", "broth"};
    strbfSentence.append(saWords[0]);
    for (int i=1; i < saWords.length; i++){
      strbfSentence.append(' ').append(saWords[i]);
    }
    System.out.println("String in StringBuffer object is \'" + strbfSentence + "\'");
    System.out.println("Capacity of the StringBuffer object is: " + strbfSentence.capacity() + "; and the String length is: " + strbfSentence.length());
    strbfSentence.insert(strbfSentence.lastIndexOf("cooks") + 4 , "ie");
    strbfSentence.insert(strbfSentence.lastIndexOf("broth") + 5 , "er");
    System.out.println("String in StringBuffer object is \'" + strbfSentence + "\'");
    System.out.println("Capacity of the StringBuffer object is: " + strbfSentence.capacity() + "; and the String length is: " + strbfSentence.length());
  }
}
