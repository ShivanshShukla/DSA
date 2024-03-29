import java.util.*;

public class PrintNtimes {

    public static List<String> printNtimes(int n) {
        // Write your code here.
        List<String> str = new ArrayList<>();
        print(1, n, str);
        return str;
    }

    public static void print(int i, int n, List<String> str) {
        if (i > n) {
            return;
        } else {
            str.add("Coding Ninjas");
            print(i + 1, n, str);
        }
    }
}
