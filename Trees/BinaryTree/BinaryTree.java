package BinaryTree;
class Node<T>
{
  T item;
  Node<T> left;
  Node<T> right;
  Node<T> parent;
    Node(T newItem){
      this.item=newItem;
      this.left=null;
      this.right=null;
      this.parent=null;
    }
}
class BinaryTree<T> implements BinaryTreeInterface{
    Node<T> root=null;
    public Node<T> add(T newItem){
     
       if(root==null){
       Node<T> newNode=new Node<T>(newItem);
        root=newNode;
        return root;
      }
        else{
        return Node<T> addNewNode(root,T newItem);
    }
     
      }
      
     public Node<T> addNewNode(Node<T>root,T newItem){
     
     }
    }
  
