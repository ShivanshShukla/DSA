package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class E_1700 {

    public static void main(String[] args) {
        int arr1[] = { 1,1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1};
        int arr2[] = { 0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0};
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i : arr1) {
            queue.add(i);
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            stack.push(arr2[i]);
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == queue.peek()) {
                stack.pop();
                queue.remove();
            } else {
                int element = queue.remove();
                queue.add(element);
                if (queue.contains(stack.peek())) {
                    continue;
                } else
                    break;
            }
        }
        System.out.println(queue.size());
    }
}