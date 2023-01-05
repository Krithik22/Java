public class SmallestLetterGreaterThanTarget {
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] == target) {
                if(mid == letters.length - 1){
                    mid = -1;
                }
                return letters[mid + 1];
            } else if(target > letters[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return letters[start];
    }

    static char soln(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        char ans = soln(letters, target);
        // char ans = nextGreatestLetter(letters, target);

        System.out.println(ans);
    }
}
