package arcade.intro.exploringTheWaters.areSimilar;

public class Main {
    boolean areSimilar(int[] a, int[] b) {
        int lastDiff = -1;
        boolean swapped = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (swapped) {
                    return false;
                }

                if (lastDiff == -1) {
                    lastDiff = i;
                } else {
                    if (a[i] == b[lastDiff] && a[lastDiff] == b[i]) {
                        swapped = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
