package DoubleLinkedList;

class Element<E>
{
  E item;
  Element<E> prev;
  Element<E> next;
}
class DoubleLinkedList<T> implements DoubleLinkedListInterface<T>
{
  Element<T> root;
  Element<T> top;
  public void addFirst(T newItem){
    //
    Element<T> newElement=new Element<T>();
    newElement.item=newItem;
    newElement.prev=null;
    newElement.next=null;
    //
    if(root==null){
      root=newElement;
      top=newElement;
      
    }
    else{
    root.prev=newElement;
      newElement.next=root;
      root=newElement;
    }
   //  System.out.println(newElement);
  }
   public void addLast(T newItem){
    //
    Element<T> newElement=new Element<T>();
    newElement.item=newItem;
    newElement.prev=null;
    newElement.next=null;
    //
    if(top==null){
      root=newElement;
      top=newElement;
    }
    else{
      newElement.prev=top;
      top.next=newElement;
      top=newElement;
    }
     //System.out.println(newElement);
  }
   public T removeLast(){
    // Remove and return Last element
    T retValue=null;
     if(top!=null){
        retValue=top.item;
        top=top.prev;
    }
    return retValue;
  }
   public T removeFirst(){
    // Remove and return first element
    T retValue=null;
     if(root!=null){
        retValue=root.item;
        root=root.next;
    }
    return retValue;
  }
  public boolean isEmpty(){
    // return true if list is empty
    if(top==null || root==null){
      return true;
    }
    else{
      return false;
    }
  }
   public void insertAt(int index, T newItem){
      Element<T> curr=root;
      int count=1;
       while(curr!=null){
       
         if(count==index)
         {
           
          break;
         }
        curr=curr.next;
        count++;
       
       }
       //
       
      Element<T> newElement=new Element<T>();
      newElement.item=newItem;
      newElement.prev=curr.prev;
      newElement.next=curr;
      // 
      curr.prev.next=newElement;
      curr.prev=newElement;
      
     
   }
}