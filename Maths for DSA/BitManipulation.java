public class BitManipulation {
    public static void main(String[] args) {
        // right most significant bit
        int n = 10;
        System.out.println(n & (-n));
    }
}
