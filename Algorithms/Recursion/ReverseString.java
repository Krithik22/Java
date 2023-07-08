import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] ans = reverse(str.toCharArray(), 0, str.length() - 1);
        System.out.println(Arrays.toString(ans));
    }

    static char[] reverse(char[] str, int s, int e) {
        if (s < e) {

            s++;
            e--;
            return reverse(str, s, e);
        }
        return str;
    }
}