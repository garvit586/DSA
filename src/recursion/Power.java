package recursion;

public class Power {

    public static int power(int x,int n){
        if (n==0){
            return 1;
        }
        int ans = x * power(x,n-1);
        return ans;
    }

    public static void main(String[] args) {
        int ans = power(3,4);
        System.out.println(ans);
    }
}
