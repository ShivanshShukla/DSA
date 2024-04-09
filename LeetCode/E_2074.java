package LeetCode;

public class E_2074 {

    public static void main(String[] args) {
        int k = 3;
        int tickets[] = { 84, 49, 5, 24, 70, 77, 87, 8 };
        // when will k turns zero
        int n = tickets.length;
        int time = 0;
        if (tickets[k] == 1)
            System.out.println(k + 1);
        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] == 0)
                    continue;
                tickets[i] = tickets[i] - 1;
                time++;
                if (tickets[k] == 0)
                    break;
            }
        }
        k--;
        System.out.println(time);
    }
}   