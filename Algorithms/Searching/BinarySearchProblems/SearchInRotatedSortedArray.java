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


    static int findPivotWithDuplicates(int[] arr){
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
            
            // If the elements at start, middle and end are equal, then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // check if the elements at the start and end are pivot
                // check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                // check if end is pivot
                if (arr[end] < arr[end-1]) {
                    return end - 1;
                }
                end--;
            } 
            // left side is sorted so pivot should be in right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else{
                end = mid - 1;
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
    static int kunalSearchSoln(int[] nums, int target){
        int pivot = findPivot(nums);
        // if pivot not found then it is a normal sorted array, it is not a rotated array. So just perform binarySearch
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length);
        }

        // if the pivot element = target then return it
        if(nums[pivot] == target){
            return pivot;
        }

        // If the target element > start element then obiviously in an rotated array it is enough to search till the pivot
        // because after the pivot element everything will be small 
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);
        }
        
        return binarySearch(nums, target, pivot + 1, nums.length);
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }
}