package arcade.intro.islandOfKnowledge.isIpv4Address;

public class Main {
    boolean isIPv4Address(String inputString) {
        String[] split = inputString.split("\\.");
        if (split.length != 4) {
            return false;
        }

        for (String piece : split) {
            try {
                int digits = Integer.parseInt(piece);
                if (digits < 0 || digits > 255) {
                    return false;
                }

                // Ensure that there were no leading zeros
                if (!piece.equals("" + digits)) {
                    return false;
                }
            } catch (Exception exception) {
                return false;
            }
        }

        return true;
    }

}
