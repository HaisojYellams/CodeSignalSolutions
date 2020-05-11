package arcade.intro.exploringTheWaters.addBorder;

public class Main {
    String[] addBorder(String[] picture) {
        String[] result = new String[picture.length + 2];
        StringBuilder firstLast = new StringBuilder("**");
        for (int i = 0, length = picture[0].length(); i < length; i++) {
            firstLast.append('*');
        }

        String frame = firstLast.toString();
        result[0] = frame;
        result[result.length - 1] = frame;

        for (int i = 0; i < picture.length; i++) {
            result[i + 1] = "*" + picture[i] + "*";
        }

        return result;
    }

}
