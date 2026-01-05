package LinkedList.SingleLinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private static int size;

    SLL() {
        SLL.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void InsertFirst(int num) {
        Node node = new Node(num);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void InsertLast(int value) {
        if (head == null || tail == null) {
            this.InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void Insert(int value, int index) {
        if (index > size) {
            System.out.println("Index is out of range");
            return;
        }
        if (index == 0) {
            InsertFirst(value);
            return;
        }
        if (index == size-1) {
            InsertLast(value);
            return;
        }
        int n = 1;
        Node temp = head;
        while (n != index) {
            temp = temp.next;
            n += 1;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;
    }

    public int DeleteFirst() {
        if (head == null)
            return -1;
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int DeleteLast() {
        if (head == null)
            return -1;
        int val = tail.value;
         Node secondLast = getRef(size - 1);
        tail = secondLast;
        tail.next = null;
        size -= 1;
        return val;
    }

    public int Delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("Please verify the index value");
            return -1;
        }
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size) {
            return DeleteLast();
        }
        Node address = getRef(index -1);
        int val = address.next.value;
        address.next = address.next.next;
        
        size--;
        return val;
    }

    public Node getRef(int index){
    Node node = head;
    for(int i  = 1 ;i < index ; i++){
    node = node.next;
    }
    return node;
    }

    public void InsertRec(int value , int index){

        head = InsertRec(value, index,head);
    }

    private Node InsertRec(int value , int index , Node node){
    if(index == 0){
    Node temp = new Node(value,node);
    size++;
    return temp;
    }
    node.next = InsertRec(value, index-1, node.next);
    return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();

    }

    public void removeDuplicate() {
        if (head == null)
            return;

        Node temp2 = head;
        Node temp1 = head.next;
        while (temp1 != null) {
            if (temp2.value == temp1.value) {

                temp2.next = temp1.next;
                temp1 = temp1.next;
                size--;
            } else {

                temp2 = temp1;
                temp1 = temp1.next;
            }
        }
        tail = temp2;
        
    }

    public static SLL Merge(SLL first, SLL Second){
    Node f = first.head;
    Node s = Second.head;
     SLL ans = new SLL();
    while (f != null && s != null) {
        if(f.value < s.value){
        ans.InsertLast(f.value);
        f = f.next;
        size++;
        }else {
        ans.InsertLast(s.value);
        s = s.next;
        size++;
        }
    }
        while(f!= null){
        ans.InsertLast(f.value);
        f=f.next;
        size++;
        }
         while(s!= null){
        ans.InsertLast(s.value);
        s=s.next;
        size++;
        }
    
        return ans;
    }

    public void ReverseList(Node node){
    if( node == tail ){
    head = tail ;
    return ;
    }
    ReverseList(node.next);
    tail.next = node;
    tail = node ;
    tail.next = null;
    }
    
    // iteration for reverse a linkied list
    public void reverseList(Node node){
        if(node == null){
        return ;
        }
        Node prev = null;
        Node pres = node;
        
        while(pres != null){
            Node Next = head.next;
        pres.next = prev;
        prev = pres;
        pres = Next;
        }
    }
    
    private class Node {
        private int value;
        private Node next;

        public Node(int num) {
            this.value = num;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}






