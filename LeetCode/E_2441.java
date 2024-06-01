
import java.util.Arrays;

/**
 * E_2441
 */
public class E_2441 {
    public static void main(String[] args) {
        int num[] = {-1,2,-3,3};
        Arrays.sort(num);
        for (int i = num.length-1; i >= 0; i--) {
            boolean flag = false;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == num[i] * -1) {
                    System.out.println(num[i]);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
    }
}