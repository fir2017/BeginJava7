public class testStringBufferCapacity {
  public static void main (String[] args){
    StringBuffer strbfTest = new StringBuffer("This is a book");
    System.out.println("The capacity of StringBuffer \'" + strbfTest + "\':" + strbfTest.capacity());
    StringBuffer strbfTest1 = new StringBuffer("This is a book. This is a book");
    System.out.println("The capacity of StringBuffer \'" + strbfTest1 + "\':" + strbfTest1.capacity());
    strbfTest = new StringBuffer("This");
    System.out.println("The capacity of StringBuffer \'" + strbfTest + "\':" + strbfTest.capacity());
    strbfTest.append(" is a second book. This is a third book. and furter more.....");
    System.out.println("The capacity of StringBuffer \'" + strbfTest + ":" + strbfTest.length() + "\':" + strbfTest.capacity());
  }
}
