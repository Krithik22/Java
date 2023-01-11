public class CountEvenNoOfDigits {
    public static int findNumbers(int[] nums) {
        int evenCnt = 0;
        for(int num : nums){
            int cnt = 0;
            while(num > 0){
                cnt++;
                num /= 10;
            }
            if(cnt%2 == 0){
                evenCnt++;
            }
        }
        return evenCnt;
    }
    public static void main(String[] args) {
        
    }
}
