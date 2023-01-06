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

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        

        // checks for the order of the array
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if(target < arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }
        
        return -1;
    }

    static int FindEleInMountainArr(int[] arr, int target){
        int peak = peakMountainArray(arr);
        
        int ans = orderAgnosticBS(arr, target, 0, peak);
        if (ans == -1) {
            ans = orderAgnosticBS(arr, target, peak+1, arr.length - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int ans = FindEleInMountainArr(arr, 3);
        System.out.println(ans);
    }
}
