public class HappyNumber {
    public static void main(String[] args) {
        boolean ans = isHappy(2);
        System.out.println(ans);
    }

    static boolean isHappy(int n) {
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            System.out.println(n);
            n = squareSum(n);
        }
        return false;
    }

    static int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}