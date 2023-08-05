public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String ans = solution("aabbaa", 0, " ");
        System.out.println(ans);
    }

    static String solution(String str, int ind, String ans) {
        if (ind >= str.length()) {
            return ans;
        }
        char ch = str.charAt(ind);
        if (ch != ans.charAt(ans.length() - 1)) {
            ans += ch;
        }
        return solution(str, ind + 1, ans);
    }
}