public class FindInMountainArr {
    static int peakMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // At last both start and end points to a single element which is the peak element
        return start;
    }

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

    static int FindEleInMountainArr(int[] arr, int target){
        int peak = peakMountainArray(arr);
        int start = 0;
        int ans = binarySearch(arr, target, start, peak);
        if (ans == -1) {
            ans = binarySearch(arr, target, peak+1, arr.length - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int ans = FindEleInMountainArr(arr, 3);
        System.out.println(ans);
    }
}
