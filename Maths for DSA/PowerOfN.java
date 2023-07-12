public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(powerOf(3, 6));
    }

    static int powerOf(int base, int n) {
        int ans = 1;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            if (last == 1) {
                ans = ans * base;
            }
            base = base * base;
        }
        return ans;
    }
}
