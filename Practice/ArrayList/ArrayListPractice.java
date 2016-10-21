package ArrayList;
import java.util.*;
class ArrayListPractice{
  public static void main(String args[]){
    ArrayList<String> aL=new ArrayList<String>();
    //
   // add
    aL.add("mano");
    aL.add("hello");
    aL.add("test");
    //
    //get
    System.out.println("the first element"+aL.get(0));
    
    //Iterator
     System.out.println("Iterator ");
    Iterator it=aL.iterator();
    while(it.hasNext()){
      String temp=(String)it.next();
      System.out.println(temp);
    }
    
     //List Iterator - reverse direction
     System.out.println("List Iterator ");
    ListIterator itl=aL.listIterator(aL.size());
    while(itl.hasPrevious()){
      String temp=(String)itl.previous();
      System.out.println(temp);
    }
    
    //remove, we can remove by object
    aL.remove("mano");
     
     System.out.println("Iterator ");
    it=aL.iterator();
    while(it.hasNext()){
      String temp=(String)it.next();
      System.out.println(temp);
    }
    
    //contains
    System.out.println("Conains - hello ");
    System.out.println(aL.contains("hello"));
    
    //indexOf
    System.out.println("Index of - test ");
    System.out.println(aL.indexOf("test"));
    
    
  }
}