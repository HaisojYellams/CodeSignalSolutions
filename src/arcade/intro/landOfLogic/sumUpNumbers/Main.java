package arcade.intro.landOfLogic.sumUpNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    int sumUpNumbers(String inputString) {
        Matcher matcher = Pattern.compile("\\d+").matcher(inputString);
        int total = 0;
        while (matcher.find()) {
            total += Integer.parseInt(matcher.group());
        }

        return total;
    }

}
