package CustomStack;
class Element<E>
{
E item;
Element<E> next;
}
class CustomStack<T>
{
Element<T> top=null;
public boolean isEmpty(){
if(top==null){
return true;
}
else{
return false;
}
}
public void push(T newItem)
{
Element<T> newElement=new Element<T>();
newElement.item=newItem;
newElement.next=null;
if(top==null)
{
top=newElement;
}
else{
newElement.next=top;
top=newElement;
}
}
public T pop(){
T topvalue=null;
if(!isEmpty()){
topvalue=top.item;
top=top.next;
}
return topvalue;
}
}
