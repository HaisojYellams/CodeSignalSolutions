package arcade.intro.islandOfKnowledge.avoidObstacles;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    int avoidObstacles(int[] inputArray) {
        Set<Integer> obstacles = new HashSet<>();

        int end = 0;
        for (int obstacle : inputArray) {
            obstacles.add(obstacle);
            end = Math.max(end, obstacle);
        }

        end += 1;

        int jumpSize = 0;
        int currentChain = 0;
        for (int i = 1; i <= end; i++) {
            if (obstacles.contains(i)) {
                currentChain += 1;
            } else {
                jumpSize = Math.max(jumpSize, currentChain);
                currentChain = 0;
            }
        }

        while (jumpSize < end) {
            jumpSize += 1;
            if (obstacles.contains(jumpSize)) {
                continue;
            }

            int checker = jumpSize * 2;
            while (checker < end) {
                if (obstacles.contains(checker)) {
                    break;
                }
                checker += jumpSize;
            }

            if (checker >= end) {
                break;
            }
        }

        return jumpSize;
    }
}
