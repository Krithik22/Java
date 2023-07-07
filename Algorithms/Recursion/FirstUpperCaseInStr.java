public class FirstUpperCaseInStr {
    public static void main(String[] args) {
        String str = "geekSforgeeKs";
        char ans = firstUpper(str, 0);
        System.out.println(ans);
    }

    static char firstUpper(String str, int ind) {
        char c = str.charAt(ind);
        if (c == '\0') {
            return 0;
        }
        if (Character.isUpperCase(c)) {
            return c;
        }
        return firstUpper(str, ind + 1);
    }
}
