import java.util.List;

public class CountItemMatches {

    // Mistakes:
    // 1. In place of .length, you should use .size() in list
    // 2.In place of arr[i] indexing, you should use list.get(i)
    // 3.You should not use "==" in lists, instead you should use .equals()
    // because .equals() checks for the value if they are same
    // whereas indexing checks for the reference 
    public static void main(String[] args) {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            String[] keyItems = {"type","color","name"};
            int keyIndex;
            for(int i = 0; i < keyItems.length; i++){
                if(keyItems[i].equals(ruleKey)){
                    keyIndex = i;
                    break;
                }
            }
            int cnt = 0;
            for(List item : items){
                String keyValue = (String)item.get(keyIndex);
                if(keyValue.equals(ruleValue)){
                    cnt++;
                }
            }
            return cnt;
        }
}
