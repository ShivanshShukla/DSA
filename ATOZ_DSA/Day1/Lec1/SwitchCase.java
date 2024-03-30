package Day1.Lec1;

public class SwitchCase {

    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        switch (ch) {
            case 1:
                return Math.PI * Math.pow(a[0], 2);
            case 2:
                return a[0] * a[1];
            default:
                return 0;
        }
    }
}
