public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < transposeMatrix.length; i++){
            for(int j = 0; j < transposeMatrix[i].length; j++){
                // if(i == j){
                //     continue;
                // }
                // int temp = matrix[i][j];
                // matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp;
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }
}
