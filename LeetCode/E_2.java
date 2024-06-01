import java.util.*;

public class E_2 {
    public static void main(String[] args) {
        int arr1[] = { 2,4,3 };
        int arr2[] = { 5,6,4 };
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        for (int i : arr1) {
            list1.add(i);
        }
        for (int i : arr2) {
            list2.add(i);
        }
        int carry = 0;
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            int sum = iterator1.next() + iterator2.next() + carry;
            carry = 0;
            if (sum < 9) {
                list3.add(sum);
            } else {
                list3.add(sum % 10);
                carry = 1;
            }
        }
        while (iterator1.hasNext()) {
            int sum = iterator1.next() + carry;
            carry = 0;
            if (sum < 9) {
                list3.add(sum);
            } else {
                list3.add(sum % 10);
                carry = 1;
            }
        }
        while (iterator2.hasNext()) {
            int sum = iterator2.next() + carry;
            carry = 0;
            if (sum < 9) {
                list3.add(sum);
            } else {
                list3.add(sum % 10);
                carry = 1;
            }
        }
        if(carry!=0){
            list3.add(carry);
        }
        for (Integer integer : list3) {
            System.out.print(integer + " ");
        }
        
    }
}
