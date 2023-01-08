public class RotationCntInRoatedSortedArray {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (arr[mid] < arr[mid-1]) {
                return mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int rotationCnt(int[] arr){
        int pivot = findPivot(arr);
        int cnt = pivot + 1;
        return cnt;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int ans = rotationCnt(nums);
        System.out.println(ans);
    }
}
