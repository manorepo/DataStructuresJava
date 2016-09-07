package HashMap;
import java.util.*; 
  class Student{
      int id;
      String sName;
      Student(int id, String sName){
        this.id=id;
        this.sName=sName;
      }
  }
  class HashMapExample{
    
    public static void main(String args[]){
      HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
    System.out.println("Number of students ?");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Student Id");
      int id=sc.nextInt();
      System.out.println("Student Name");
      String sName=sc.next();
      hm.put(id,new Student(id,sName));
    }
    Set data=hm.entrySet();
    Iterator it=data.iterator();
    while(it.hasNext()){
        Map.Entry element=(Map.Entry)it.next();
        System.out.println(element.getKey()+"  " +((Student)element.getValue()).sName);
      
    }
      final HashMap<Integer,Student> hm2=new HashMap<Integer,Student>(hm);
     System.out.println("Sort using TreeMap and Comparator");
      //Sort using TreeMap and comparator
      TreeMap<Integer,Student> tm=new TreeMap<Integer,Student>(new Comparator<Integer>(){
        public int compare(Integer key1, Integer key2){
          return ((Student)hm2.get(key1)).sName.compareTo(((Student)hm2.get(key2)).sName);
        }
      });
      Set dataT=hm.entrySet();
    Iterator itT=dataT.iterator();
    while(itT.hasNext()){
        Map.Entry element=(Map.Entry)itT.next();
        tm.put((Integer)(element.getKey()),(Student)(element.getValue()));
      
    }
      
      Set dataS=tm.entrySet();
    Iterator itS=dataS.iterator();
    while(itS.hasNext()){
        Map.Entry element=(Map.Entry)itS.next();
        System.out.println(element.getKey()+"  " +((Student)element.getValue()).sName);
      
    }
      
      //Sort using List
      System.out.println("Sort using List and Comparator");
      List<Map.Entry> listMap=new ArrayList<Map.Entry>(hm.entrySet());
      Collections.sort(listMap, new Comparator<Map.Entry>(){
        public int compare(Map.Entry e1,Map.Entry e2){
          return ((Student)(e1.getValue())).sName.compareTo(((Student)(e2.getValue())).sName);
        }
      });
      for(Map.Entry entry: listMap){
        System.out.println(entry.getKey()+"   "+((Student)entry.getValue()).sName);
      }
    }
  }