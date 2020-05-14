package arcade.intro.landOfLogic.sudoku;

public class Main {
    boolean sudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (!validRow(grid[i]) || !validCol(grid, i) || !validSquare(grid, 3 * (i / 3), 3 * (i % 3))) {
                return false;
            }
        }

        return true;
    }

    boolean validRow(int[] row) {
        boolean[] counts = new boolean[10];
        for (int val : row) {
            if (counts[val]) {
                return false;
            }
            counts[val] = true;
        }

        return true;
    }

    boolean validCol(int[][] grid, int column) {
        boolean[] counts = new boolean[10];
        for (int[] row : grid) {
            int val = row[column];
            if (counts[val]) {
                return false;
            }
            counts[val] = true;
        }

        return true;
    }

    boolean validSquare(int[][] grid, int startRow, int startCol) {
        boolean[] counts = new boolean[10];
        for (int row = startRow, endRow = startRow + 3; row < endRow; row++) {
            for (int col = startCol, endCol = startCol + 3; col < endCol; col++) {
                int val = grid[row][col];
                if (counts[val]) {
                    return false;
                }
                counts[val] = true;
            }
        }

        return true;
    }
}
