package arcade.intro.divingDeeper.arrayMaxConsecutiveSum;

public class Main {
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int maxSum = 0;
        int currentSum;
        for (int i = 0; i < k; i++) {
            maxSum += inputArray[i];
        }
        currentSum = maxSum;
        for (int i = k; i < inputArray.length; i++) {
            currentSum += inputArray[i] - inputArray[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
