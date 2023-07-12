public class PascalTriangleSum {
    public static void main(String[] args) {
        // Return the sum for nth row of the pascal's triangle
        int n = 5;
        int ans = 1 << (n - 1); // 1 << n = 2**n
        System.out.println(ans);
    }
}