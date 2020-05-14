package arcade.intro.divingDeeper.differentSymbolsNaive;

public class Main {
    int differentSymbolsNaive(String s) {
        int[] counts = new int[26];
        int unique = 0;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            counts[index] += 1;
            if (counts[index] == 1) {
                unique += 1;
            }
        }

        return unique;
    }
}
