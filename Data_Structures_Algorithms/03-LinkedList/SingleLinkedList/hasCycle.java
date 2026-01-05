package LinkedList.SingleLinkedList;


public class hasCycle {

    class ListNode {
        int val;
        ListNode next;
  
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int LengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                slow = slow.next;
                int count = 0;
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);

            }
        }
        return -1;
    }

    public ListNode returnIndex(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                slow = slow.next;
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;

                }
                return head;
            }
        }
        return null;
    }

    public ListNode MiddleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 1️⃣ Move 'prev' to one node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // 2️⃣ Start pointers for reversal
        ListNode curr = prev.next; // start of the segment (node 2)
        ListNode nextNode = curr.next; // node after curr (node 3)

        for (int i = 0; i < right - left; i++) {
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
            nextNode = curr.next;
        }

        return dummy.next;
    }

    public ListNode reverseList(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode prev = null;
        ListNode pres = node;

        while (pres != null) {
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = MiddleNode(head);
        ListNode SecondHead = reverseList(mid);
        ListNode Store = SecondHead;

        while (head != null && SecondHead != null) {
            if (head.val != SecondHead.val) {
                break;
            }
            head = head.next;
            SecondHead = SecondHead.next;
        }
        reverseList(Store);
        return head == null || SecondHead == null;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode mid = MiddleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;

        }
        if (hf != null) {
            hf.next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);
        ListNode current = dummyhead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int rem = sum % 10;

            current.next = new ListNode(rem);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        return dummyhead.next;
    }
 
    public ListNode reverseKGroup(ListNode head, int k) {
    if (k <= 1 || head == null || head.next == null) return head;

    ListNode curr = head;
    ListNode prev = null;

    while (true) {
        ListNode check = curr;
        int count = 0;
        while (check != null && count < k) { check = check.next; count++; }
        if (count < k) break; 
        ListNode last = prev;   
        ListNode newEnd = curr;  
        ListNode next = null;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (last != null) last.next = prev;
        else head = prev;
        newEnd.next = curr;
        prev = newEnd;
    }

    return head;
}

    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null){
        return head;
        }
        ListNode tail = head;
        ListNode last = head;
        int length  = 1;
        while(tail.next != null){
        tail = tail.next;
        length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newlast  = head;
        for(int i = 0 ;i < skip-1;i++){
        newlast = newlast.next;
        }  
        
        head =  newlast.next;
        newlast.next = null;
        return head;

    }
}
