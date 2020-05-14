package arcade.intro.landOfLogic.spiralNumbers;

public class Main {
    int[][] spiralNumbers(int n) {
        int[][] result = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        Direction direction = Direction.RIGHT;

        int lastVal = n * n;
        while (value <= lastVal) {
            result[row][col] = value;
            value += 1;

            switch (direction) {
                case RIGHT:
                    col += 1;
                    if (col >= n || result[row][col] > 0) {
                        col -= 1;
                        row += 1;
                        direction = Direction.DOWN;
                    }
                    break;
                case DOWN:
                    row += 1;
                    if (row >= n || result[row][col] > 0) {
                        row -= 1;
                        col -= 1;
                        direction = Direction.LEFT;
                    }
                    break;
                case LEFT:
                    col -= 1;
                    if (col < 0 || result[row][col] > 0) {
                        col += 1;
                        row -= 1;
                        direction = Direction.UP;
                    }
                    break;
                case UP:
                    row -= 1;
                    if (row < 0 || result[row][col] > 0) {
                        row += 1;
                        col += 1;
                        direction = Direction.RIGHT;
                    }
                    break;
            }
        }

        return result;
    }

    enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }
}
