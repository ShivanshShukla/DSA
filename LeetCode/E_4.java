
import java.util.ArrayList;

public class E_4 {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        int arr2[] = { 3, 4 };
        int newArr[] = new int[arr.length + arr2.length];
        int index = 0;
        int low = 0;
        int high = newArr.length - 1;
        int left = 0;
        int right = 0;

       /*  while (left < arr.length && right < arr2.length) {
            if (arr[left] < arr2[right]) {
                newArr[index] = arr[left];
                index++;
                left++;
            } else {
                newArr[index] = arr2[right];
                index++;
                right++;
            }

        }
        while (left < arr.length) {
            newArr[index] = arr[left];
            left++;
            index++;
        }
        while (right < arr2.length) {
            newArr[index] = arr2[right];
            right++;
            index++;
        }

        for (int i : newArr) {
            System.out.print(i + " ");
        }
        if ((low + high) % 2 == 0) {
            int mid = (low + high) / 2;
            double median = newArr[mid];
            System.out.println(median);
        } else {
            int mid = (low + high) / 2;
            double median = ((newArr[mid] + newArr[mid + 1])) / 2;
            System.out.println(median);

        } */
        double a = 5/2d;
        System.out.println(a);
    }
}
