

import java.util.*;

class Array {
    static ArrayList<Integer> al=new ArrayList<>();
    public void reArrangeInPair(int arr[]) {
        int newArr[] = new int[arr.length];
        int odd = 1, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[odd] = arr[i];
                odd += 2;
            } else {
                newArr[even] = arr[i];
                even += 2;
            }
        }
        display(newArr);
    }

    public void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class E_2149 {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        Array a = new Array();
        a.reArrangeInPair(arr);
    }
}