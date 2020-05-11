package arcade.intro.exploringTheWaters.alternatingSums;

public class Main {
    int[] alternatingSums(int[] a) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            result[i % 2] += a[i];
        }

        return result;
    }

}
