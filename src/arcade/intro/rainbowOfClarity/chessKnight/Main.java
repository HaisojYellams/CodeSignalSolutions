package arcade.intro.rainbowOfClarity.chessKnight;

public class Main {
    int chessKnight(String cell) {
        int row = Integer.parseInt(cell.substring(1)) - 1;
        int col = cell.charAt(0) - 'a';

        int[][] offsets = new int[][]{
                {-2, 1},
                {-1, 2},
                {1, 2},
                {2, 1},
                {2, -1},
                {1, -2},
                {-1, -2},
                {-2, -1}
        };

        int spots = 0;
        for (int[] offset : offsets) {
            int rowCheck = row + offset[0];
            if (rowCheck < 0 || rowCheck > 7) {
                continue;
            }

            int colCheck = col + offset[1];
            if (colCheck < 0 || colCheck > 7) {
                continue;
            }

            spots += 1;
        }

        return spots;
    }
}
