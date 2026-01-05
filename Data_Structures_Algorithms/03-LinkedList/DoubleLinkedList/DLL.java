package LinkedList.DoubleLinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL() {
        this.size = 0;
    }

    public void InsertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void InsertLast(int value) {
        if (head == null) {
            InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.next = null;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void Insert(int value, int index) {
        if (index == 0) {
            InsertFirst(value);
            return;
        }
        if (index == size) {
            InsertLast(value);
            return;
        }
        Node referNode = getIndex(index - 1);
        Node node = new Node(value, referNode, referNode.next);
        referNode.next.prev = node;
        referNode.next = node;
        size++;
    }

    public int DeleteFirst() {
        if (head == null)
            return -1;
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return val;
    }

    public int DeleteLast() {
        if (head == null) {
            return -1;
        }
        if (size <= 1) {
            return DeleteFirst();
        }
        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public int Delete(int index) {
        if (index > size) {
            return -1;
        }
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size) {
            return DeleteLast();
        }
        Node ref = getIndex(index);
        int val = ref.value;
        ref.prev.next = ref.next;
        ref.next.prev = ref.prev;
        size--;
        return val;

    }

    public Node getIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is not allocated");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }

    public void displayrev() {
        if (head == null) {
            System.out.println("Memory is not allocated");
        } else {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.prev;
            }
            System.out.println("START");

        }

    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;

        }

    }
}
