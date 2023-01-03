public class OrderAgnosticBS {
    static int ascendingOrderBS(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if(target > arr[mid]){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int descendingOrderBS(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                start = mid+1;
            } else if(target > arr[mid]){
                end = mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        int ans;
        if (isAsc) {
            ans = ascendingOrderBS(arr, target, start, end);
        } else{
            ans = descendingOrderBS(arr, target, start, end);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int ans = orderAgnosticBS(nums, target);
        System.out.println("Element found at index: " + ans);
    }
}
