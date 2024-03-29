class Re_occur {
    
    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(Re_occur.factorial(5));
    }
}
