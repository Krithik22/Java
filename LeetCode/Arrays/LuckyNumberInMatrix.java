public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] nums = {{3,7,8},{9,11,13},{15,16,17}};
        luckyNumber(nums);
    }

    static void luckyNumber(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
