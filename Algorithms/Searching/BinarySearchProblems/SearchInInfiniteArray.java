public class SearchInInfiniteArray{
    static int binarySearch(int[] nums, int target, int start, int end){
        
        // in this problem we dont know the length of the array so we have to input the start and end
        // We are finding the range in solution function
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int solution(int nums[], int target){
        // As we don't know the length of the array we'll start by giving the first two index and arr box size as 2
        // so till the target > nums[end], loop by changing the start and end
        // end = previousEnd + boxsize * 2
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            // we are creating a temporary start variable to store the new start since we have to use the 
            // start to calculate the boxsize 
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        int ans = binarySearch(nums, target, start, end);
        return ans;
    }
    public static void main(String[] args) {
        // Note: Possible error is that while doubling the array range the index can be out of bound/range
        int[] nums = {1,3,5,8,13,15,19,23,26,30,68,73,88,93};
        int target = 30;
        int ans = solution(nums, target);
        System.out.println(ans);
    }
}