
public class CeilingFloor {
    static int ceiling(int[] arr, int target){
        int start = 0, end = arr.length -1, ans;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                return ans;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        ans = arr[start];
        return ans;
    }
    static int floor(int[] arr, int target){
        int start = 0, end = arr.length -1, ans;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                return ans;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        ans = arr[end];
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-18, -12, -4, 0, 2,3,4,15,16,18,22,45,89};
        int ans = floor(nums, 23);
        System.out.println(ans);
    }
}
