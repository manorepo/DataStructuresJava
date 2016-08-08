package CustomStack;
import java.util.*;
class TestStack{
  public static void main(String args[]){
    CustomStack<String> c=new CustomStack<String>();
    Scanner sc=new Scanner(System.in);
  for(int i=1;i<=5;i++){
    System.out.println("Push -");
    
    c.push( sc.next());
  }
  for(int i=1;i<=9;i++){
    System.out.println("isEmpty "+c.isEmpty());
    System.out.println("Pop -" +c.pop());
    
  }
}
}