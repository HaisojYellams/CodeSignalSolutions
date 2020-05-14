package arcade.intro.rainbowOfClarity.lineEncoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.lineEncoding("aaabbbbcddd"));
    }

    String lineEncoding(String s) {
        StringBuilder builder = new StringBuilder();
        Matcher matcher = Pattern.compile("((.)\\2*)")
                .matcher(s);
        while (matcher.find()) {
            int length = matcher.group().length();
            if (length > 1) {
                builder.append(length);
            }
            builder.append(matcher.group(2));
        }

        return builder.toString();
    }
}
