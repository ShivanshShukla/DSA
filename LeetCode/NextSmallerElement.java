
import java.util.*;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 3 };
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            while (stack.peek() >= currentElement) {
                stack.pop();
            }
            arr[i] = stack.peek();
            stack.push(currentElement);
        }
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

    }
}
