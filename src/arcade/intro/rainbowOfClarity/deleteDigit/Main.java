package arcade.intro.rainbowOfClarity.deleteDigit;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.deleteDigit(152));
    }

    int deleteDigit(int n) {
        int result = 0;

        for (int backOne = 1, modder = 10; backOne <= n; backOne = modder, modder *= 10) {
            int toTest = (n / modder) * backOne + (n % backOne);
            if (toTest > result) {
                result = toTest;
            }
        }

        return result;
    }

}
