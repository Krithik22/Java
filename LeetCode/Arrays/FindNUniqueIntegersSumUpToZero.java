public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2 == 0){
            for(int i = 0; i < n; i+=2){
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
            return arr;
        }
        arr[0] = 0;
        for(int i = 1; i < n; i+=2){
            arr[i] = i;
            arr[i+1] = -i;
        }
        return arr;
    }
}
