package arcade.intro.edgeOfTheOcean.almostIncreasingSequence;

public class Main {
    boolean almostIncreasingSequence(int[] sequence) {
        int dipIndex = -1;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                if (dipIndex >= 0) {
                    return false;
                }

                dipIndex = i;
            }
        }

        if (dipIndex == -1 || dipIndex == 0 || dipIndex == sequence.length - 2) {
            return true;
        }

        return sequence[dipIndex - 1] < sequence[dipIndex + 1] || sequence[dipIndex] < sequence[dipIndex + 2];
    }
}
