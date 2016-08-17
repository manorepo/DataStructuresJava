package BST;
class Student
{
    int id;
    Student left;
    Student right;
    String name;
    Student(int id, String name){
       this.id=id;
       this.name=name;
       this.left=null;
       this.right=null;
    }
}

class BST{
  
  Student root=null;
  public void addStudentNode(int id, String name){
    Student curr=root;
      if(root==null){
          Student newStudent=new Student(id,name);
          root=newStudent;
      }
      else
      {
         
          while(true){
              if(id<curr.id){
                if(curr.left!=null)
                  curr=curr.left;
                else
                  break;
              }
              else if(id>curr.id){
                 if(curr.right!=null)
                  curr=curr.right;
                else
                  break;
              }
          }
         if(id<curr.id){
            Student newStudent=new Student(id,name);
            curr.left=newStudent;
          }
        else if(id>curr.id){
           Student newStudent=new Student(id,name);
           curr.right=newStudent;
          }
      }
   
  }
  public void inOrder(){
    printinOrder(root);
  }
  public void printinOrder(Student curr){
    if(curr!=null){
      printinOrder(curr.left);
      System.out.println(curr.id+":"+ curr.name);
      printinOrder(curr.right);
      }
  }
  public static void main(String args[]){
    BST b=new BST();
    b.addStudentNode(5,"five");
    b.addStudentNode(7,"seven");
    b.addStudentNode(3,"three");
    b.addStudentNode(4,"four");
    b.addStudentNode(6,"six");
    b.inOrder();
  }
}