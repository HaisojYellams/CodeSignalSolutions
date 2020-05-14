package arcade.intro.eruptionOfLight.buildPalindrome;

public class Main {
    String buildPalindrome(String st) {
        int index = 0;
        while (!isPalindrome(st.substring(index))) {
            index += 1;
        }

        StringBuilder builder = new StringBuilder(st.substring(0, index));
        return st + builder.reverse().toString();
    }

    boolean isPalindrome(String string) {
        for (
                int forward = 0, backward = string.length() - 1;
                forward < backward;
                forward += 1, backward -= 1
        ) {
            if (string.charAt(forward) != string.charAt(backward)) {
                return false;
            }
        }

        return true;
    }
}
