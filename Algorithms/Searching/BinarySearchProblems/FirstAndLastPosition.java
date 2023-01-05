public class FirstAndLastPosition {
    static int search(int[] nums, int target, boolean findStartIndex){
        // Three parameters: 1. the array 2. the target element 
        // 3. To check if we want the start of the target or last position of the target

        // intially ans = -1 because if not found it returns -1
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // normal binary search algorithm
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                // so if the middle element == target, then the possible ans = mid element
                // because we can have that number also before that middle and also after middle element
                ans = mid;
                // if we want to find the start position end->mid-1, else start->mid+1
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    static int[] searchrange(int[] nums, int target){
        // In the question if not found target they have said to return {-1, -1}
        // so initially ans = {-1,-1}
        int[] ans = {-1, -1};

        // searching the start positon of the target
        ans[0] = search(nums, target, true);

        // if it is not -1, then end position is searched
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);   
        }     
        // finally returns ans.   
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
