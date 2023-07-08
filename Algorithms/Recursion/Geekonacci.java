import java.util.Scanner;

public class Geekonacci {
    public static void main(String[] args) {
        // code
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a, b, c, n;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            n = in.nextInt();
            int ans = geek(a, b, c, n);
            System.out.println(ans);
        }
    }

    static int geek(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }

    static int geekRec(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        if (n == 3) {
            return c;
        }
        return geekRec(a, b, c, n - 1) + geekRec(a, b, c, n - 2) + geekRec(a, b, c, n - 3);
    }
}
