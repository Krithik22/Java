public class NoOfSetBits {
    public static void main(String[] args) {
        System.out.println(setBitsCnt(3));
    }

    static int setBitsCnt(int n) {
        int cnt = 0;
        while (n > 0) {
            int last = n & 1;
            if (last == 1) {
                cnt++;
            }
            n = n >> 1;
        }
        return cnt;
    }
}
