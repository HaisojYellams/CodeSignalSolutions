package arcade.smoothSailing.commonCharacterCount;

public class Main {
    int commonCharacterCount(String s1, String s2) {
        int total = 0;
        int[][] counts = new int[2][26];

        for (char c : s1.toCharArray()) {
            counts[0][c - 'a'] += 1;
        }
        for (char c : s2.toCharArray()) {
            counts[1][c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            total += Math.min(counts[0][i], counts[1][i]);
        }

        return total;
    }
}
