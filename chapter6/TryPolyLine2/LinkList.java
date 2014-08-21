public class LinkList {
  public LinkList(){}
  public LinkList(Object o){
    start = current = end = new ListItem(o);
  }

  public LinkList(Object[] os){
    for(Object o : os) {
      addItemOnEnd(o); 
    }
  } 
/*
  public LinkList(ListItem[] items){
    if(items != null) {
      start = end = items[0];
    }
    for(int i = 0; i< items.length; i++){
      end.setNext(items[i]);
    }
    current = items[items.length];
  }
*/
  public ListItem getStart(){
    current = start;
    return current;
  }

  public ListItem getCurrent(){
    return current;
  }

  public ListItem getEnd(){
    current = end;
    return end;
  }

  public void pullItem(Object o){
    ListItem newItem = new ListItem(o);
    if(start == null){
      start = current = end = newItem; 
    }else{
      newItem.setNext(start);
      start = newItem;
      current = start;
    }
  }

  public ListItem shiftItem(){
    ListItem tmp = start; 
    start = start.getNext();
    current = start;
    return tmp; 
  }

  public void addAfterCurrent(Object o){
    ListItem newItem = new ListItem(o);
    if(current == null){
      //start = end = newItem;
      addItemOnEnd(o);
    }else{
      newItem.setNext(current.getNext());
      current.setNext(newItem);
      current = newItem;
    }
  }

  public void addItemOnEnd(Object o){
    ListItem newObject = new ListItem(o);
    if(start == null){
      start = newObject;
    }else{
      end.setNext(newObject);
    }
    current = end = newObject;
  }
  
  public ListItem getNext(){
    if(current != null){
      current = current.getNext();
      return current;
    }
    return null;
  }

  /*
  @Override
  public String toString(){
    StringBuffer str = new StringBuffer();
    if(start = null){
      str.append("null");
    }else{
      str.append(start.toString()); 
      aItem = start.getNext();
      while(aItem != null){
        str.append(";" + aItem.toString());
        aItem = aItem.getNext(); 
      }
    }
    return str.toString();
  }

  */
  protected ListItem start;
  protected ListItem current;
  protected ListItem end; 
} 
