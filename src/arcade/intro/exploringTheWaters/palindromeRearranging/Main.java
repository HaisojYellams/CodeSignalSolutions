package arcade.intro.exploringTheWaters.palindromeRearranging;

public class Main {
    boolean palindromeRearranging(String inputString) {
        int[] counts = new int[26];
        for (char c : inputString.toCharArray()) {
            counts[c - 'a'] += 1;
        }

        int numOdd = 0;
        for (int count : counts) {
            if (count % 2 == 1) {
                numOdd += 1;
                if (numOdd > 1) {
                    return false;
                }
            }
        }

        return true;
    }

}
