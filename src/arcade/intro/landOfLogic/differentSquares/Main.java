package arcade.intro.landOfLogic.differentSquares;

import java.util.HashSet;
import java.util.Set;

public class Main {
    int differentSquares(int[][] matrix) {
        Set<String> squares = new HashSet<>();
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                squares.add(String.valueOf(matrix[row][col]) + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1]);
            }
        }

        return squares.size();
    }

}
