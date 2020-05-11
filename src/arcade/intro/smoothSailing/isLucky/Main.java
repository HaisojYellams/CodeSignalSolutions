package arcade.intro.smoothSailing.isLucky;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isLucky(1230));
    }

    boolean isLucky(int n) {
        int halfDigits = ((int) Math.log10(n) + 1) / 2;
        int total = 0;
        for (int i = 0; i < halfDigits; i++) {
            total += n % 10;
            n /= 10;
        }
        for (int i = 0; i < halfDigits; i++) {
            total -= n % 10;
            n /= 10;
        }

        return total == 0;
    }
}
