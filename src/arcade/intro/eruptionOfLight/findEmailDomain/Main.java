package arcade.intro.eruptionOfLight.findEmailDomain;

public class Main {
    String findEmailDomain(String address) {
        int strudel = address.lastIndexOf('@');
        return address.substring(strudel + 1);
    }

}
