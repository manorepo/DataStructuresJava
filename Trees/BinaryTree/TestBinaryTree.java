package BinaryTree;
class TestBinaryTree 
{
  public static void main(String args[]){
 BinaryTree<Integer> bt=new BinaryTree<Integer>();
  bt.addNode(1);
  bt.addNode(2);
  bt.addNode(3);
  bt.addNode(4);
  bt.addNode(5);
  bt.addNode(6);
  bt.addNode(7);
 // bt.addNode(8);
  bt.inOrder();
  bt.preOrder();
  bt.postOrder();
  System.out.println("Height "+ bt.height());
}
}