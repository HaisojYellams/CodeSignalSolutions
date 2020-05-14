package arcade.intro.rainsOfReason.alphabeticShift;

public class Main {
    String alphabeticShift(String inputString) {
        StringBuilder builder = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            builder.append((char) ('a' + ((c - 'a') + 1) % 26));
        }
        return builder.toString();
    }

}
