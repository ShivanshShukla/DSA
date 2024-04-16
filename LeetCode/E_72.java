package LeetCode;

import java.util.*;

public class E_72 {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    stack.push(i);
                    stack.push(j);
                }
            }
        }
        while (!stack.isEmpty()) {
            int col = stack.pop();
            int row = stack.pop();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == row || j == col) {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
