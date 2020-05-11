package arcade.intro.islandOfKnowledge.arrayMaximalAdjacentDifference;

public class Main {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maximal = 0;
        for (int i = 1; i < inputArray.length; i++) {
            maximal = Math.max(maximal, Math.abs(inputArray[i] - inputArray[i - 1]));
        }
        return maximal;
    }
}
