public class MaxPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i = 0; i < logs.length; i++){
            for(int j = logs[i][0]; j < logs[i][1]; j++){
                arr[j - 1950]++;
            }
        }
        int maxCnt = 0;
        int maxYear = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxCnt){
                maxCnt = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
