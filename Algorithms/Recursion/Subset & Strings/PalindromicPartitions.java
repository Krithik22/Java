import java.util.ArrayList;

public class PalindromicPartitions {
    public static void main(String[] args) {
        String s = "madam";
        // System.out.println(isPalindrome(s.toCharArray()));
        ArrayList<ArrayList<String>> ans = allPalindromicPerms(s);
        System.out.println(ans);
    }

    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        String[] arr = S.split("");
        for (String str : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<String> internal = new ArrayList<>(outer.get(i));
                internal.add(str);
                outer.add(internal);
            }
        }
        return outer;
    }

    static boolean isPalindrome(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
