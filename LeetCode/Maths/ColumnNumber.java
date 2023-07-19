public class ColumnNumber {
    public static void main(String[] args) {
        String ans = convert(701);
        System.out.println(ans);
    }

    static String convertToTitle(int n) {
        String s = "";
        // n == columnNumber
        if (n < 26) {
            s += (char) (n + 64);
        } else {
            while (n > 0) {
                // s += (char) ((n / 26) + 64);
                s += (char) ((n % 26) + 64);
                n = n / 26;
            }
        }
        // char s1 = (char) ((n / 26) + 64);
        // char s2 = (char) ((n % 26) + 64);

        // s += s1 + s2;
        return s;
    }

    static String convert(int n) {
        String s = "";
        if (n < 26) {
            s += (char) (n + 64);
            return s;
        }
        s += convert(n / 26);
        s += (char) ((n % 26) + 64);
        return s;
    }
}
