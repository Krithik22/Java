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
    public int maximumPopulationSoln2(int[][] logs) {
        int[] arr = new int[101];
        int maxCnt = 0;
        int maxYear = 0;
        for(int i = 0; i < logs.length; i++){
            int birthYr = logs[i][0];
            int deathYr = logs[i][1];
            arr[birthYr - 1950]++;
            arr[deathYr - 1950]--;
        }
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxCnt){
                maxCnt = arr[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
}
