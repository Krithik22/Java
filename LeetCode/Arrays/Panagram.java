
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
        // Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
        boolean[] mark = new boolean[26];
 
        // For indexing in mark[]
        int index = 0;
        
        str = str.toLowerCase();
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            // if ('A' <= str.charAt(i)
            //     && str.charAt(i) <= 'Z')
            //     index = str.charAt(i) - 'A';
 
            // If lowercase character, subtract 'a'
            // to find index.
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
 
            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // String sentence = "leetcode";
        boolean ans = pangram(sentence);
        System.out.println(ans);
    }
}