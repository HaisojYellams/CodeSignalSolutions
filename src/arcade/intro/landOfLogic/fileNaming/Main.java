package arcade.intro.landOfLogic.fileNaming;

import java.util.HashSet;
import java.util.Set;

public class Main {
    String[] fileNaming(String[] names) {
        Set<String> usedNames = new HashSet<>();
        String[] output = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String nameToUse;
            if (!usedNames.contains(name)) {
                nameToUse = name;
                output[i] = name;
            } else {
                int k = 1;
                nameToUse = name + "(" + k + ")";
                while (usedNames.contains(nameToUse)) {
                    k += 1;
                    nameToUse = name + "(" + k + ")";
                }
            }

            usedNames.add(nameToUse);
            output[i] = nameToUse;
        }

        return output;
    }
}
