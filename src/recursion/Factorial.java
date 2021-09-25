package recursion;

public class Factorial {

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = Factorial(n - 1);
        return n * ans;
    }

    public static void main(String[] args) {
        int ans = Factorial(5);
        System.out.println(ans);
    }
}
