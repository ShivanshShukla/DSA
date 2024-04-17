package LinkedList;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
        this.val = 0;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void createLinkedList(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        ListNode itr = head;
        while (itr != null) {
            System.out.print(itr.val + " ");
            itr = itr.next;
        }
        System.out.println();
    }

    public void oddEvenLinkedList() {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode itr = head;
        while (itr.next != null && itr != null) {
            al.add(itr.val);
            itr = itr.next.next;
        }
        if (itr != null) {
            al.add(itr.val);
        }
        itr = head.next;
        while (itr != null) {
            al.add(itr.val);
            itr = itr.next.next;
        }
        itr = head;
        for (Integer integer : al) {
            itr.val = integer;
            itr = itr.next;
        }
    }

    public void sortLinkedList() {
        ListNode first = head;
        int count = 0;
        ListNode tail = null;
        while (first != null) {
            count++;
            first = first.next;
        }
        while (count >= 0) {
            first = head;
            ListNode second = head.next;
            while (second != tail) {
                if (first.val > second.val) {
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
                first = second;
                second = second.next;
            }
            tail = second;
            count--;
        }
    }

    public void rotateLinkedList() {
        ListNode tail = null, itr = head;
        while (itr.next != null) {
            itr = itr.next;
        }
        tail = itr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();
        itr = head;
        while (k > 0) {
            int last = tail.val;
            int temp = itr.val;
            itr = head.next;
            while (itr != null) {
                int val = itr.val;
                itr.val = temp;
                temp = val;
                itr = itr.next;
            }
            itr = head;
            itr.val = last;
            k--;
        }
        sc.close();
    }
}
