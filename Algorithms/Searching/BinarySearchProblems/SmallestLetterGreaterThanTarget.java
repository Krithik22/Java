public class SmallestLetterGreaterThanTarget {
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] == target) {
                return letters[mid + 1];
            } else if(target > letters[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return letters[start];
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
}
