import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        // subset("", "abc");
        System.out.println(subsetRec("", "abc"));
    }

    // p - processed, up - unprocessed
    static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }

    static ArrayList<String> subsetRec(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList();
            if (!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRec(p + ch, up.substring(1));
        ArrayList<String> right = subsetRec(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
