package arcade.intro.exploringTheWaters.arrayChange;

public class Main {
    int arrayChange(int[] inputArray) {
        int numMoves = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                numMoves += 1 + inputArray[i - 1] - inputArray[i];
                inputArray[i] = inputArray[i - 1] + 1;
            }
        }

        return numMoves;
    }

}
