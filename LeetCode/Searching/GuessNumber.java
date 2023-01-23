public class GuessNumber{
    /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame {
    public int guess(int num){
        int pick = 6; //pick is a value given by the computer
        if(num == pick){
            return 0;
        } else if(num > pick){
            return -1;
        } else{
            return 1;
        }
    }
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(guess(mid) == 0){
                return mid;
            } else if(guess(mid) < 0){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
// }
}