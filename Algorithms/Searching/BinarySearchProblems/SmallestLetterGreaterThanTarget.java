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

    // Note the letters wrap around that is if there is no element greater than it, then the first element is displayed
    static char soln(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            // calculate the mid
            int mid = start + (end - start)/2;

            // If the target character < letters[mid], then change end = mid - 1
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                // else, the target will be greater than it. So start -> mid + 1
                start = mid + 1;
            }
        }
        // so we'll have a start value at last, for example if there is no greater element then the start 
        // is at last index, start % letters.length gives 0
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
