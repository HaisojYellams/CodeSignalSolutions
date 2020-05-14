package arcade.intro.divingDeeper.extractEachKth;

public class Main {
    int[] extractEachKth(int[] inputArray, int k) {
        int[] result = new int[inputArray.length - (inputArray.length / k)];
        int index = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if ((1 + i) % k == 0) {
                continue;
            }

            result[index] = inputArray[i];
            index += 1;
        }

        return result;
    }
}
