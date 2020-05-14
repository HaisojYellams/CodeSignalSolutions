package arcade.intro.darkWilderness.longestDigitsPrefix;

public class Main {
    String longestDigitsPrefix(String inputString) {
        StringBuilder builder = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c < '0' || c > '9') {
                break;
            }

            builder.append(c);
        }

        return builder.toString();
    }
}
