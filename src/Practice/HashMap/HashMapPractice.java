package HashMap;
import java.util.*;
class HashMapPractice{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    //put
    hm.put(1,"first");
    hm.put(2,"second");
    hm.put(3,"third");
    //
    //get
    String temp=hm.get(3);
    System.out.println(temp);
   //
     System.out.println("Iterate through entries");
    Set<Map.Entry<Integer,String>> it=hm.entrySet();
    for(Map.Entry<Integer,String> s:it){
      temp=(String)s.getValue();
       System.out.println(temp);
   
    }
    //
    //contains key
     System.out.println("Contains key 2 " + hm.containsKey(2));
    System.out.println("Contains key 7 " + hm.containsKey(7));
    System.out.println("Contains value first " + hm.containsValue("first"));
    
    //Keyset
     System.out.println("Keyset");
    Set<Integer> keys=hm.keySet();
    for(Integer k: keys){
      System.out.println(k);
    }
    
    System.out.println("values set");
   
    for(String k:  hm.values()){
      System.out.println(k);
    }

  }
  //Map.Entry<E,E>
  //    -getKey
  //    -getValue
  //    -
  
}