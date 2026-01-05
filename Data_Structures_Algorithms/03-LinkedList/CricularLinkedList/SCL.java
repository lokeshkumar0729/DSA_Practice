package LinkedList.CricularLinkedList;

public class SCL {

   private Node head;
   private Node tail;
   private int size;

    SCL(){
    this.size  = 0;
    }

   public int getSize(){
        return size;
}

public void InsertFirst(int value){
  Node node = new Node(value);
  if(head ==  null){
  head = tail = node; 
  return;
}
node.next = head;
tail.next = node;
head = node;
size++;
}

public void InsertLast(int value){
    if(head == null){
    InsertFirst(value);
    return;
    }
    Node node = new Node(value);
    tail.next = node;
    node.next = head;
    tail = node;
    size++;
}

public void display(){
if(head == null){
System.out.println("Memory is not Allocated");
return;
}
Node temp = head;
do{
System.out.print(temp.value+" -> ");
temp = temp.next;

}while(temp!= head);
System.out.println("END");
}

   private class Node{
       int value ;
       Node next;

       Node(int value){
    this.value = value;
    }
    
    }
}
