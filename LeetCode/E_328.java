package LeetCode;

import LinkedList.LinkedList;

public class E_328 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        int arr[] = { 2, 1, 3, 5, 6, 4, 7 };
        for (int i = 0; i < arr.length; i++) {
            l1.createLinkedList(arr[i]);
        }
        l1.display();
        // l1.sortLinkedList();
        l1.rotateLinkedList();
        l1.display();
    }
}
