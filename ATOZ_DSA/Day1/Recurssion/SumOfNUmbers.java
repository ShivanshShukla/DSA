package Day1.Recurssion;
class Recurssion {

    public static int sum(int x) {
        int sum = 0;
        sum = sumAll(sum, x);
        return sum;
    }

    public static int sumAll(int sum, int x) {
        if (x < 1) {
            return sum;
        }
        return sumAll(sum + x, x - 1);
    }
}

public class SumOfNUmbers {
    public static void main(String[] args) {
        System.out.println(Recurssion.sum(5));
    }
}
