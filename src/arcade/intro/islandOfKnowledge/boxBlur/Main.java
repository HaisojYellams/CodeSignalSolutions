package arcade.intro.islandOfKnowledge.boxBlur;

public class Main {
    int[][] boxBlur(int[][] image) {
        int newHeight = image.length - 2;
        int newWidth = image[0].length - 2;
        int[][] result = new int[newHeight][newWidth];

        for (int row = 0; row < newHeight; row++) {
            for (int col = 0; col < newWidth; col++) {
                int total = 0;
                for (int rowChange = 0; rowChange < 3; rowChange++) {
                    for (int colChange = 0; colChange < 3; colChange++) {
                        total += image[row + rowChange][col + colChange];
                    }
                }

                result[row][col] = total / 9;
            }
        }

        return result;
    }
}
