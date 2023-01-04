import java.util.HashSet;
import java.util.Set;

public class Panagram{
    static boolean pangram(String sentence){
        
        boolean[] mark = new boolean[26];
        int index = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            if('a' <= sentence.charAt(i) && 'z' >= sentence.charAt(i)){
                index = sentence.charAt(i) - 'a';
            } else{
                continue;
            }
            mark[index] = true;
        }
        for (int i = 0; i < mark.length; i++) {
            if(mark[i] == false){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPangram(String str)
    {
        Set<Character> letters = new HashSet<>();
        for(char letter : str.toCharArray()){
            letters.add(letter);
        }
        return letters.size() == 26;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // String sentence = "leetcode";
        boolean ans = checkPangram(sentence);
        System.out.println(ans);
    }
}