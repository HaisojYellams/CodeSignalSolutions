package arcade.intro.landOfLogic.messageFromBinaryCode;

public class Main {
    String messageFromBinaryCode(String code) {
        StringBuilder builder = new StringBuilder();
        int length = code.length();
        for (int start = 0, end = 8; start < length; start = end, end += 8) {
            int character = 0;
            for (int i = start; i < end; i++) {
                character = (character << 1) + (code.charAt(i) - '0');
            }

            builder.append((char) character);
        }

        return builder.toString();
    }

}
