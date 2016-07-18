import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
class Employee{
  int id;
  String name;
  int Salary;
  Employee(int id, String name, int Salary){
    this.id=id;
    this.name=name;
    this.Salary=Salary;
  }
}
class sortByname implements Comparator<Employee>{
public int compare(Employee e1, Employee e2){
  return e1.name.compareTo(e2.name);
}  
}
class ComparatorSample{
  public static void main(String args[]){
   Employee e1=new Employee(1,"one",1000);
        Employee e2=new Employee(3,"three",100);
     Employee e3=new Employee(6,"six",500);
     Employee e4=new Employee(2,"two",2000);
     Employee e5=new Employee(4,"four",1300);
     Employee e6=new Employee(7,"seven",700);
     ArrayList<Employee> list=new ArrayList<Employee>();
     list.add(e1);
     list.add(e2);
         list.add(e3);
         list.add(e4);
         list.add(e5);
         list.add(e6);
    Collections.sort(list,new sortByname());
    for(Employee e:list){
      System.out.println(e.id+" "+e.name);
    }
     Collections.sort(list,new Comparator<Employee>(){
     public int compare(Employee e1, Employee e2){
       if(e1.Salary>e2.Salary)
         return 1;
       else
         return -1;
     }
     });
    Iterator it=list.iterator();
    while(it.hasNext()){
      Employee e=(Employee)it.next();
      System.out.println(e.id+" " +e.Salary);
    }
  }
}