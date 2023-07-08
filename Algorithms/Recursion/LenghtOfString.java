public class LenghtOfString {
    static int len(String str, int i) {
        if (str.charAt(i) != '\0' && i + 1 < str.length()) {
            return len(str, i + 1);
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int ans = len("geeksforgeeks", 0);
        System.out.println(ans);
    }
}
