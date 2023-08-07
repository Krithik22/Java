public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        // String ans = skip(str, "");
        String ans = skip2(str);
        System.out.println(ans);
    }

    static String skip(String str, String ans) {
        if (str == "") {
            return ans;
        }
        if (str.charAt(0) != 'a') {
            ans += str.charAt(0);
        }
        str = str.substring(1);
        return skip(str, ans);
    }

    static String skip2(String str) {
        if (str == "") {
            return str;
        }
        if (str.charAt(0) != 'a') {
            return str.charAt(0) + skip2(str.substring(1));
        }
        return skip2(str.substring(1));
    }
}
