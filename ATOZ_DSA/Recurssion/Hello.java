import java.util.ArrayList;

public class Hello {

    public static int[] num(int x) {
        int arr[] = new int[x];
        num2(x, arr);
        return arr;
    }

    public static void num2(int x, int[] arr) {
        if (x == 0) {
            return;
        } else {
            arr[x - 1] = x;
            num2(x - 1, arr);
        }
    }

    public static void num3(int x,ArrayList al){
        
    }
    public static void main(String[] args) {
        System.out.println(num(5).toString());
    }
}
