package arcade.intro.landOfLogic.longestWord;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    String longestWord(String text) {
        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);
        int length = 0;
        String output = "";
        while (matcher.find()) {
            String match = matcher.group();
            int newLength = match.length();
            if (newLength > length) {
                length = newLength;
                output = match;
            }
        }

        return output;
    }
}
