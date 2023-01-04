
public class Panagram{
    static boolean panagram(String sentence){
        
        int[] mark = new int[26];
        int index = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            if('a' < sentence.charAt(i) && 'z' > sentence.charAt(i)){
                index = sentence.charAt(i) - 'a';
            } else{
                continue;
            }
            mark[index] = 1;
        }
        for (int i = 0; i < mark.length; i++) {
            if(mark[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = panagram(sentence);
        System.out.println(ans);
    }
}