public class ListItem {
  public ListItem(Object o){
    object = o;
    next = null;
  }  
  
  public void setNext(ListItem o){
    next = o;
  }
  
  public ListItem getNext(){
    return next; 
  }
  public Object getObject(){
    return object;
  }
  public void setNext(Object o){
    next = new ListItem(o);
  }
   
  @Override
  public String toString(){
    return "(" + object + ")";
  }
  
  private Object object;
  private ListItem next;
} 
