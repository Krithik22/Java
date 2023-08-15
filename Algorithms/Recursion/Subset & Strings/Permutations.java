import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> list = permutation("", "a");
        System.out.println(list);
    }

    static ArrayList<String> permutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            String comb = first + ch + second;
            ans.addAll(permutation(comb, up.substring(1)));
        }
        return ans;
    }
}