package arcade.edgeOfTheOcean.matrixElementsSum;

public class Main {
    int matrixElementsSum(int[][] matrix) {
        int total = 0;
        for (int col=0; col<matrix[0].length; col++){
            for (int[] row : matrix) {
                if (row[col] == 0) {
                    break;
                }

                total += row[col];
            }
        }

        return total;
    }
}
