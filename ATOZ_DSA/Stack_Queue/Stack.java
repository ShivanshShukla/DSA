package Stack_Queue;

class Implementaion {
    int arr[];
    int head = -1;

    public Implementaion(int capacity) {
        arr = new int[capacity];
        head = 0;
    }

    public void push(int num) {
        if (head == arr.length) {
            isFull();
            return;
        } else {
            arr[head] = num;
            head++;
        }
    }

    public int pop() {
        if (head == arr.length) {
            head = head - 1;
        }
        if (head < 0) {
            isEmpty();
            return -1;
        } else {
            int remove = arr[head];
            System.out.println(remove);
            head--;
            return remove;
        }
    }

    public int top() {
        if (head < 0) {
            isEmpty();
            return -1;
        } else {
            return arr[head];
        }
    }

    public boolean isEmpty() {
        if (head == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    public boolean isFull() {
        if (head >= arr.length) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Implementaion i = new Implementaion(5);
        i.push(1);
        i.push(2);
        i.push(3);
        i.push(4);
        i.push(5);
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        i.top();
        i.isFull();
        i.isEmpty();

    }
}
