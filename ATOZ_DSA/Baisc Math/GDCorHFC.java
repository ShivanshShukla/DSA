// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.TreeSet;

public class GDCorHFC {

    public static int calcGCD(int n, int m) {
        // Write your code here.
        if (n == m)
            return n;
        TreeSet<Integer> ts = new TreeSet<>();
        int small = Math.min(n, m);
        for (int i = 1; i <= small; i++) {
            if (n % i == 0 && m % i == 0)
                ts.add(i);
        }
        return ts.last();
    }

}
