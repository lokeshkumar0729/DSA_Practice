package LinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.InsertFirst(2);
        list.InsertFirst(245);
        list.InsertFirst(22);
        list.display();
        System.out.println("Size = " + list.getSize());
        // list.displayrev();
        list.InsertLast(19);
        list.InsertLast(123);
        list.InsertLast(190);
        list.display();
        System.out.println("Size = " + list.getSize());
        // list.displayrev();
        list.Insert(100, 3);
        list.display();
        System.out.println("Size = " + list.getSize());
        // list.displayrev();
        System.out.println(list.Delete(7));
        list.display();
        System.out.println("Size = " + list.getSize());
    }
}
