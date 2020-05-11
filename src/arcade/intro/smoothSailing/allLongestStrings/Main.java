package arcade.intro.smoothSailing.allLongestStrings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    String[] allLongestStrings(String[] inputArray) {
        List<String> longestStrings = new ArrayList<>();
        int stringLength = 0;

        for (String string: inputArray){
            int currentLength = string.length();
            if (currentLength > stringLength){
                longestStrings = new ArrayList<>();
                stringLength = currentLength;
            }

            if (currentLength == stringLength){
                longestStrings.add(string);
            }
        }

        return longestStrings.toArray(new String[0]);
    }
}
