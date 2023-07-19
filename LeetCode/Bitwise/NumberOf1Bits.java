import java.io.*;
import java.util.*;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int ans = hammingWeight(-3);
        System.out.println(ans);
    }

    static int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            // if ((n & 1) == 1) {
            // cnt++;
            // }
            // n = n >> 1;
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }
}