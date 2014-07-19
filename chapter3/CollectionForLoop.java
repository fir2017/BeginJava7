public class CollectionForLoop {
  enum Season {sprint,summar, fall, winter}
  public static void main(String[] args) {
    for(Season s:Season.values()){
      System.out.println(s);
    } 
  }
}
