package arcade.intro.eruptionOfLight.isBeautifulString;

public class Main {
    boolean isBeautifulString(String inputString) {
        int[] counts = new int[26];
        for (char c : inputString.toCharArray()) {
            counts[c - 'a'] += 1;
        }

        for (int i = 1; i < 26; i++) {
            if (counts[i] > counts[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
