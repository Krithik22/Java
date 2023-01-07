public class SearchInRotatedSortedArray{
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // finding the mid
            int mid = start + (end - start)/2;
            // end > mid is a condition because if mid is at last index, then mid+1 will be outOfBound
            if(end > mid && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // similarly if mid is at start = 0 mid-1 cannot be there
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int ans = binarySearch(nums,target,0,pivot);
        if(ans == -1){
            ans = binarySearch(nums,target,pivot + 1,nums.length - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }
}