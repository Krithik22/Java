public class Fibonacci {
    public static void main(String[] args) {
        int n = fibo(50);
        System.out.println(n);
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // if (n < 2) {
        // return n;
        // }
        return fibo(n - 1) + fibo(n - 2);
    }
}
