package LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertFirst(4);
        list.InsertFirst(14);
        list.InsertFirst(32);
        list.InsertFirst(2);
        list.display();
        // System.out.println("Size = " + list.getSize());
        // list.InsertLast(7);
        // list.InsertLast(70);
        // list.InsertLast(17);
        // list.display();
        // System.out.println("Size = " + list.getSize());
        // list.Insert(49, 4);
        // list.display();
        // System.out.println("Size = " + list.getSize());
        // System.out.println(list.DeleteFirst());
        // list.display();
        // System.out.println("Size = " + list.getSize());
        // System.out.println(list.DeleteLast());
        // list.display();
        // System.out.println("Size = " + list.getSize());
        // System.out.println(list.Delete(2));
        // list.display();
        // System.out.println("Size = " + list.getSize());
        list.InsertRec(30, 2);
        list.display();
    }
}
