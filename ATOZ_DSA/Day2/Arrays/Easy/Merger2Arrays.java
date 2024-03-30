package Day2.Arrays.Easy;

import java.util.ArrayList;
import java.util.TreeSet;

public class Merger2Arrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 ,7};
        int b[] = { 2, 4, 6, 8 };
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            ts.add(b[i]);
        }
        ArrayList<Integer> al = new ArrayList<>(ts);
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
    }
}
