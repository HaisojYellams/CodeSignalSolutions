package arcade.intro.throughTheFog.absoluteValueSumMinimization;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    int absoluteValuesSumMinimization(int[] a) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int val : a) {
            counts.put(val, counts.getOrDefault(val, 0) + 1);
        }

        int bestSum = Integer.MAX_VALUE;
        int bestValue = Integer.MAX_VALUE;
        Set<Integer> uniqueValues = counts.keySet();
        for (int value : uniqueValues) {
            int currentSum = 0;

            for (int checker : uniqueValues) {
                currentSum += counts.get(checker) * Math.abs(value - checker);
                if (currentSum > bestSum) {
                    break;
                }
            }

            if (currentSum < bestSum || (currentSum == bestSum && value < bestValue)) {
                bestSum = currentSum;
                bestValue = value;
            }
        }

        return bestValue;
    }
}
