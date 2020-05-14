package arcade.intro.divingDeeper.firstDigit;

public class Main {
    char firstDigit(String inputString) {
        char result = '\n';
        for (char c : inputString.toCharArray()) {
            if (c >= '0' && c <= '9') {
                result = c;
                break;
            }
        }

        return result;
    }
}
