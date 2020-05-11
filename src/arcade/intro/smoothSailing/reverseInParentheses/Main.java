package arcade.intro.smoothSailing.reverseInParentheses;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverseInParentheses("(bar)"));
    }

    String reverseInParentheses(String inputString) {
        int len = inputString.length();
        for (int forward = 0; forward < len; forward++) {
            if (inputString.charAt(forward) == '(') {
                int depth = 1;
                int backward = forward + 1;
                while (true) {
                    char c = inputString.charAt(backward);
                    if (c == ')') {
                        depth -= 1;
                        if (depth == 0) {
                            break;
                        }
                    } else if (c == '(') {
                        depth += 1;
                    }

                    backward += 1;
                }

                StringBuilder builder = new StringBuilder();
                builder.append(reverseInParentheses(inputString.substring(forward + 1, backward)));
                builder.reverse();
                return inputString.substring(0, forward) + builder.toString() + reverseInParentheses(inputString.substring(backward + 1));
            }
        }

        return inputString;
    }

}
