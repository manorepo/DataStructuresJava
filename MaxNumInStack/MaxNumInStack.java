package MaxNumInStack;
import java.util.*;
class MaxNumInStack extends Stack<Integer>
{
  Stack<Integer> maxTrace=new Stack<Integer>();
  public Integer push(Integer numb){
  if(maxTrace.isEmpty()){
  maxTrace.push(numb);
  }
  else{
    Integer m=maxTrace.peek();
    if(numb>m){
      maxTrace.push(numb);
    }
    }
     return  super.push(numb);
  }
  public Integer maxValue(){
  return maxTrace.peek();
  }
  public Integer pop(){
   Integer n=null;
  if(!super.isEmpty()){
   n=super.pop();
  Integer m=maxTrace.peek();
    if(n==m){
    Integer del=maxTrace.pop();
    }
  }
  return n;
  }
}