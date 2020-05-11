package arcade.intro.islandOfKnowledge.minesweeper;

public class Main {
    int[][] minesweeper(boolean[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int[][] result = new int[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                for (int rowCheck = row - 1, endRowCheck = row + 2; rowCheck < endRowCheck; rowCheck++) {
                    // skip rows outside of the grid
                    if (rowCheck < 0 || rowCheck >= height) {
                        continue;
                    }
                    for (int colCheck = col - 1, endColCheck = col + 2; colCheck < endColCheck; colCheck++) {
                        // skip columns outside of the grid
                        if (colCheck < 0 || colCheck >= width) {
                            continue;
                        }

                        // skip the square we're calculating, we only want the 8 neighbors
                        if (row == rowCheck && col == colCheck) {
                            continue;
                        }

                        if (matrix[rowCheck][colCheck]) {
                            result[row][col] += 1;
                        }
                    }
                }
            }
        }

        return result;
    }

}
