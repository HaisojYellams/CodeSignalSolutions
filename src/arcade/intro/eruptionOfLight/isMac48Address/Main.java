package arcade.intro.eruptionOfLight.isMac48Address;

public class Main {
    boolean isMAC48Address(String inputString) {
        return inputString.matches("^([A-F0-9]{2}-){5}[A-F0-9]{2}");
    }

}
